package com.GuviTask.Task_10.Controller;

import com.GuviTask.Task_10.Dto.Employee;
import com.GuviTask.Task_10.Repository.EmployeeRepository;
import com.GuviTask.Task_10.Service.EmoployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {
    private EmoployeeService emoployeeService;
//    private EmployeeRepository employeeRepository;
    @GetMapping("/homePage")
    public String  getAllEmployeeDetails(Model model){
        model.addAttribute("allEmpList",emoployeeService.getAllEmployeeDetails());
        return "index";
    }
//    @GetMapping("getEmployeeDetailsById/{id}")
//    public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable Long id){
//        return new ResponseEntity<>(emoployeeService.getEmployeeDetailsById(id),HttpStatus.OK);
//    }

    @GetMapping("/addNew")
    public String  addNewEmployee(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "newEmployee";
    }
    @PostMapping("/save")
    public String addEmployeeDetails(@ModelAttribute("employee") Employee employeeDto){
        emoployeeService.addEmployeeDetails(employeeDto);
        return "redirect:/homePage";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String  addNewEmployee(@PathVariable long id, Model model){
        Employee employee=emoployeeService.getEmployeeDetailsById(id);
        model.addAttribute("employee",employee);
        return "update";
    }


    @GetMapping("deleteEmployee/{id}")
    public String  deleteEmployeeDetails(@PathVariable Long  id){
        emoployeeService.deleteEmployeeDetails(id);
//        employeeRepository.deleteById(id);
        return "redirect:/homePage";
    }

}
