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