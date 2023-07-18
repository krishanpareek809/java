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