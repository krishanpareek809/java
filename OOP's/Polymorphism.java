interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    // public void record4KVideo(){
    //     System.out.println("Taking snap and recoding in 4k");
    // }
    public String[] getNetworks(){
        System.out.print("Getting list of all networks: ");
        String[] networkList = {"Pareek's", "Krishan", "AirtelFiber"};
        for (String item : networkList) {
            System.out.print(item+" ");
        }
        System.out.println();
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
    public void sampleMethod(){
        System.out.println("sample method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera cam1 = new MySmartPhone(); // This is a smartphone but use it as a camera
        // cam1.getNetworks(); --> Not allowed
        // cam1.sampleMethod(); --> Not allowed

        cam1.record4KVideo();

        MySmartPhone sm = new MySmartPhone();
        sm.sampleMethod();
        sm.recordVideo();
        sm.record4KVideo();
        sm.getNetworks();
        sm.callNumber(1234567890);
        sm.pickCall();
    }
}