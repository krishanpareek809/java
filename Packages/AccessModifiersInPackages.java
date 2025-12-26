package Packages;

class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void method1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifiersInPackages {
    public static void main(String[] args) {
        C1 c1 = new C1();
        // c1.method1();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
        // System.out.println(c1.a); // cannot use as variable a has private access
    }
}