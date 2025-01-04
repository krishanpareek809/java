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
/*
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
*/


/*
class Circle{
    public int radius;

    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int r, int h){
        super(r);
        this.height = h;
    }

    public double area(){
        return 2*Math.PI*this.radius*(this.height+this.radius);
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2, 7);

        System.out.println("Area of Cyclinder: " + c.area());
        System.out.println("Volume of Cyclinder: " + c.volume());
    }
}
*/


class Rectangle{
    public int length;
    public int breadth;

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }
    
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

}

class Cuboid extends Rectangle{
    public int height;

    Cuboid(int h){
        super(3, 4);
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long area(){
        return 2*((this.length*this.breadth)+(this.breadth*this.height)+(this.height*this.length));
    }

    public long volume(){
        return this.length*this.breadth*this.height;
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5);

        System.out.println("Area of Cuboid: " + c.area());
        System.out.println("Volume of Cuboid: " + c.volume());
    }
} 