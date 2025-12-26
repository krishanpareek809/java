package Packages.UsingPackages;

import Packages.krishan.gym.KrishanGymNew;

class Using extends KrishanGymNew{
    void method2(){
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a);
    }
}

public class UsingPackage {
    public static void main(String[] args) {
        System.out.println("I am using the packages");
        KrishanGymNew c1 = new KrishanGymNew();
        System.out.println(c1.x);
        // System.out.println(c1.y);
        // System.out.println(c1.z);
        // System.out.println(c1.a);

        Using u = new Using();
        u.method2();
    }
}