public class SameClass {
    private int b = 20;
    public int a = 61;
    int c = 100;
    protected int s = 19;

    public SameClass(){     //Constructor of the class contructor name is same as class name
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(s);
    }                        //Ends the constructor

    public static void main(String[] args){   //Program execution starts from here
        new SameClass();                   //Creating an object of same class to call the contructor and print the values of variables 
    }
}
