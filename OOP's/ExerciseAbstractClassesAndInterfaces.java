/* abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refilling the ink");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
*/

/* class Monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("speaking");
    }
    @Override
    public void eat(){
        System.out.println("eating");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping");
    }
}
*/

/* abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void camera(){
        System.out.println("using camera");
    }
    void gps(){
        System.out.println("using gps");
    }
    void ring(){
        System.out.println("ringing");
    }
    void lift(){
        System.out.println("lifting");
    }
    void disconnect(){
        System.out.println("disconnecting");
    }
}
*/

interface TVRemote{
    void pressButton();
    void normalTVRemote();
}

interface SmartTVRemote extends TVRemote{
    void touchButton();
    void smartTVRemote();
}

class TV implements TVRemote{
    void watchMovie(){
        System.out.println("watching movie");
    }
    public void pressButton(){
        System.out.println("pressing button");
    }
    public void normalTVRemote(){
        System.out.println("It's a normal TV Remote");
    }
}

public class ExerciseAbstractClassesAndInterfaces {
    public static void main(String[] args) {
        // Q1 + Q2
        // FountainPen fp = new FountainPen();
        // fp.changeNib();

        // Q3
        // Human human = new Human();
        // human.sleep();

        // Q5
        // Monkey monkey = new Human();
        // monkey.bite();
        // monkey.jump();
        // // monkey.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
        // BasicAnimal basicAnimal = new Human();
        // basicAnimal.eat();
        // basicAnimal.sleep();
        // // basicAnimal.speak(); --> error

        // Q4
        // Telephone telephone = new SmartTelephone();
        // telephone.ring();
        // telephone.lift();
        // telephone.disconnect();
        // // telephone.camera(); --> error

        // Q6 + Q7
        // TVRemote tvRemote = new TV();
        // tvRemote.pressButton();
        // tvRemote.normalTVRemote();
        // tvRemote.watchMovie(); --> error

        TV tv = new TV();
        tv.pressButton();
        tv.normalTVRemote();
        tv.watchMovie();
    }
}