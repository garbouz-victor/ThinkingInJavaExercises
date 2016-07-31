package thinking.in.java.pkg.ex4;

/**
 *
 * @author Victor
 */
public class ThinkingInJava54 {
    
    public static void main(String[] args) {
        Test test = new Test("This is test!");
    }    
}

class Test {
    Test(String s) {
        System.out.println(s);
    }
}