class A{
    public void method1(){
        System.out.println("Method 1 of class A");
    }

    public void method2(){
        System.out.println("Method 2 of class A");
    }
}

class B extends A{
    @Override
    public void method2(){
        System.out.println("Method 2 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
