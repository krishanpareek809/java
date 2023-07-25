/*
class CylinderAndSphere{
    int radius;
    int height;
    double pi = 3.14;

    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return height;
    }

    public double getSurfaceAreaOfCylinder(){
        return 2*pi*radius*(height+radius);
    }

    public double getVolumeOfCylinder(){
        return pi*radius*radius*height;
    }

    public double getSurfaceAreaOfSphere(){
        return 4*pi*radius*radius;
    }

    public double getVolumeOfSphere(){
        return (4*pi*radius*radius*radius)/3;
    }
}

public class ExerciseAccessModifiersAndConstructors {
    public static void main(String[] args) {

        CylinderAndSphere c = new CylinderAndSphere();

        c.setRadius(4);
        c.setHeight(23);
        
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        System.out.println("Surface Area of Cylinder: " + c.getSurfaceAreaOfCylinder());
        System.out.println("Volume of Cyclinder: " + c.getVolumeOfCylinder());

        System.out.println("Surface Area of Sphere: " + c.getSurfaceAreaOfSphere());
        System.out.println("Volume of Sphere: " + c.getVolumeOfSphere());
    }
}
*/


// Same question as above but using constructor
/*
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(){
        this.radius = 4;
        this.height = 23;
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return height;
    }
}

public class ExerciseAccessModifiersAndConstructors{
    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        System.out.println("Radius before setRadius Method: " + c.getRadius());
        System.out.println("Height before setHeight Method: " + c.getHeight());

        c.setRadius(1);
        c.setHeight(10);

        System.out.println("Radius after setRadius Method: " + c.getRadius());
        System.out.println("Height after setHeight Method: " + c.getHeight());
    }
}
*/


// Overloading Constructor
/*
class Rectangle{

    private int length;
    private long breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int l, long b){
        this.length = l;
        this.breadth = b;
    }

    public void setLenght(int l){
        this.length = l;
    }

    public int getLength(){
        return length;
    }

    public void setBreadth(long b){
        this.breadth = b;
    }

    public long getBreadth(){
        return breadth;
    }
}

public class ExerciseAccessModifiersAndConstructors{
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        Rectangle R = new Rectangle(3, 07);
        System.out.println(R.getLength());
        System.out.println(R.getBreadth());
    }
}
*/