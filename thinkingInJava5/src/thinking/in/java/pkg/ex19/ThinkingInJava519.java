package thinking.in.java.pkg.ex19;

/**
 *
 * @author Victor
 */
public class ThinkingInJava519 {
    public static void main(String[] args) {
        Test test = new Test();
        test.printer("1", "2");
        String[] strs = {"1", "2", "3"};        
        test.printer(strs);
    }
}
class Test {
    void printer(String... args) {
        for(String str : args) {
            System.out.println(str);
        }
    }
}