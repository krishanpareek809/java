interface sampleInterface{
    void method1();
    void method2();
}

interface childSampleInterface extends sampleInterface{
    void method3();
    void method4();
}

class MySampleClass implements childSampleInterface{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
    public void method4(){
        System.out.println("method4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}