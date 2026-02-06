package demo;

public class Parent {
    private int a = 100;      //a is private so can be accessible only within same class
    int b = 200;             // b is default so it can be accessed within the same package
    public int c = 300;    
    protected int d = 400;   //d is protected so it can be accessible within the same package & subclass
}
