package thinking.in.java.pkg.ex5;

/**
 *
 * @author Victor
 */
public class ThinkingInJava55 {
    
    public static void main(String... args) {
        Dog d = new Dog();
        d.bark();
        d.bark(new Integer(1));
        d.bark("test1");
        d.bark(0);
        d.bark(0, 1);
        d.bark(0, 1, 2);
    }
}

class Dog {
    
    void bark() {
        System.out.println("default bark!");
    }
    
    void bark(String... str) {
        System.out.println("bark String... str");
    }
    
    void bark(int... a) {
        System.out.println("bark with int... a");
    }
    
    void bark(int a1, int a2) {
        System.out.println("bark with int a1, int a2");
    }
    
    void bark(int a1) {
        System.out.println("bark with int a1");
    }
    
    void bark(Integer a) {
        System.out.println("bark with Integer a");
    }
}
