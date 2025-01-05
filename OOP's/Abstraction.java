abstract class Parent{
    public Parent(){
        System.out.println("I am the constructor of class Parent");
    }

    public void sayHello(){
        System.out.println("hi hello");
    }
    
    abstract public void greet();
    abstract public void greet2();
}

class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    
    @Override
    public void greet2(){
        System.out.println("good morning from 2");
    }
}

abstract class Child2 extends Parent{
    public void hi(){
        System.out.println("hi, I am ok");
    }
}

class Abstraction{
    public static void main(String[] args) {
        Child1 c1 = new Child1(); // allowed because it's a concrete class
        // Parent p = new Parent();  // not allowed because it's an abstract class and we cannot create object of abstract class and abstract classes are not concrete classes
        // Child2 c2 = new Child2(); // not allowed because it's an abstract class and we cannot create object of abstract class and abstract classes are not concrete classes
    }
}