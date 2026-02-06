package samepackage;
public class ClassB {
    public static void main(String[] args){
        ClassA obj = new ClassA();   //we can access classA because it is in the same package
        // System.out.println(obj.a);//this can't be called bevause this is in the private method
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
