/*
class Employee{
    String name;
    String city;
    int id;
    int age;

    public void printDetails(){
        System.out.print("I am " + name);
        System.out.print(" from " + city);
        System.out.print(" with id " + id);
        System.out.print(" and I am " + age + " years old.");
    }
}

public class CustomClass{
        public static void main(String[] args) {
        Employee krishan = new Employee(); // Instantiating a new Employee Object
        krishan.name = "Krishan Pareek";
        krishan.city = "Sardarshahar";
        krishan.id = 11;
        krishan.age = 22;

        krishan.printDetails();
    }
}
*/


/*
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class CustomClass{
    public static void main(String[] args) {
        Employee krishan = new Employee();

        krishan.salary = 10000;
        krishan.name = "Krishan Pareek";

        System.out.println(krishan.getSalary());
        System.out.println(krishan.getName());
        
        krishan.setName("krish");
        System.out.println(krishan.getName());
    }
}
*/


/*
class Square{
    int side;

    public int side(){
        return side;
    }

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

public class CustomClass{
    public static void main(String[] args) {
        Square sq = new Square();

        sq.side = 3;

        System.out.println(sq.side());
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
*/


class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running for loot");
    }

    public void fire(){
        System.out.println("Firing for safety");
    }
}

public class CustomClass{
    public static void main(String[] args) {
        TommyVecetti Player1 = new TommyVecetti();

        Player1.hit();
        Player1.run();
        Player1.fire();
    }
}