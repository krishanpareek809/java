class Phone{
    public void greet(){
        System.out.println("Hi");
    }

    public void on(){
        System.out.println("Turning on the Phone");
    }
}

class SmartPhone extends Phone{
    public void game(){
        System.out.println("Playing game");
    }
    
    public void on(){
        System.out.println("Turning on the SmartPhone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Phone p = new Phone();  // Allowed
        // SmartPhone sp = new SmartPhone();  // Allowed

        Phone obj = new SmartPhone();  // Allowed
        obj.greet();
        obj.on();
        // obj.game();  // Not Allowed

        // SmartPhone obj2 = new Phone();  // Not Allowed
    }    
}
