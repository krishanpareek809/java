/*
class Base{
    int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.print("I am in Base class and setting x now: ");
        this.x = x; 
    }

}

class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        // Object of Base class
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX());

        // Object of Derived class
        Derived d = new Derived();
        d.setY(67);
        System.out.println(d.getY());
    }
}
*/


// Constructors in Inheritance in Java
class Base{
    
    Base(){
        System.out.println("It is a constructor of class Base");
    }

    Base(int x){
        System.out.println("It is an overloaded constructor of class Base with value of x as: " + x);
    }
}

class Derived extends Base{
    
    Derived(){
        // super(2);
        System.out.println("It is a constructor of class Derived");
    }

    Derived(int x, int y){
        super(x);
        System.out.println("It is an overloaded constructor of class Derived with value of y as: " + y);
    }
}

class ChildOfDerived extends Derived{

    ChildOfDerived(){
       System.out.println("It is a constructor of class ChildOfDerived"); 
    }

    ChildOfDerived(int x, int y, int z){
        super(3, 5);
        System.out.println("It is an overloaded constructor of class ChildOfDerived");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        // Base b = new Base(5);
        // Derived d = new Derived(4,6);
        ChildOfDerived cd = new ChildOfDerived(1, 8, 9);
    }
}