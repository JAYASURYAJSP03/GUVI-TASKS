package Person;

public class Employee extends Person{
    //Create a subclass Employee that inherits from Person and adds attributes like employeeID and
    //salary.
    String employeeID;
    double salary;
    public Employee(String name,int age,String employeeID,double salary){
        //Use the super keyword to initialize the Person attributes in the Employee constructor.
        super.name=name;
        super.age=age;
        this.employeeID=employeeID;
        this.salary=salary;
    }
    public void display(){
        System.out.println("person name:"+name);
        System.out.println("person age:"+age);
        System.out.println("employee ID:"+employeeID);
        System.out.println("employee salary:"+salary);
    }

    public static void main(String[] args) {
        Person p=new Person("jsp",20);
        p.display();
        Employee e=new Employee("Jaya Surya Prakash R",21,"JSP@123",50000);

        e.display();
        p.display();
    }
}
