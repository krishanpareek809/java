/*
class Employee{

    private int id;
    private String name;

    public Employee(){
        id = 3;
        name = "Krishan Pareek";
    }

    public Employee(String n){
        name = n;
    }

    public Employee(String n, int i){
        name = n;
        id = i;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        id = i;
    }

    public void setName(String n){
        name = n;
    }
}
    
public class Constructors{
    public static void main(String[] args) {
        Employee krishan = new Employee("krishnaaaa", 4);

        // krishan.setName("krish");
        // krishan.setId(56);

        System.out.println(krishan.getName());
        System.out.println(krishan.getId());
    }
}
*/


// Copy Constructors

import javax.swing.text.Style;

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    
    Student(){

    }
}

public class Constructors{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Krishan";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}