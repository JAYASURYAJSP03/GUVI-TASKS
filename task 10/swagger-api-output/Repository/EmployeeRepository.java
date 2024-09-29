package com.GuviTask.Task_10.Repository;

import com.GuviTask.Task_10.Dto.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee,Long> {

    Optional<Employee> findByEmployeeId(Long employeeId);

    void deleteByEmployeeId(Long employeeId);
}
