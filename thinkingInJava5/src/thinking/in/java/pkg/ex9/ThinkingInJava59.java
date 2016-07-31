package thinking.in.java.pkg.ex9;

/**
 *
 * @author Victor
 */
public class ThinkingInJava59 {
    public static void main(String... args) {
        Test test = new Test();
    }
}
class Test {
    
    Test() {
        this("default string!");
    }
    
    Test (String str) {
        System.out.println("Test: " + str);
    }
}