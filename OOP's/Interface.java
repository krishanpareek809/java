interface Bicyle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicyle{
    void blowHornBullet();
    void blowHornHonda();
}

class AvonCycle implements Bicyle, HornBicyle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speed");
    }
    public void blowHornBullet(){
        System.out.println("Horn for Bullllttttttt");
    }
    public void blowHornHonda(){
        System.out.println("Horn for Honda");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(1);

        // We can create properties in Interface
        System.out.println(cycle1.a);

        // We cannot modify properties in Interface as they are final
        // cycle1.a = 454;

        cycle1.blowHorn();
        cycle1.blowHornBullet();
        cycle1.blowHornHonda();
    }
}