package Person;

public class Person {
    //1.4) Define a base class Person with attributes name and age.
    static String name;
    static int age;
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("person name:"+name);
        System.out.println("person age:"+age);
    }
}
