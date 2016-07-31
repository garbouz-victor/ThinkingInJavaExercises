package thinking.in.java.pkg.ex6;

/**
 *
 * @author Victor
 */
public class ThinkingInJava56 {
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(0, 0.0);
        d.bark(0.0, 0);
    }
}

class Dog {
    void bark (int a, double b) {
        System.out.println("bark (int a, double b) called!");
    }
    void bark (double a, int b) {
        System.out.println("bark (double a, int b) called!");
    }
}