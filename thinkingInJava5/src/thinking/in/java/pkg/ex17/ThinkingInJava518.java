package thinking.in.java.pkg.ex17;

/**
 *
 * @author Victor
 */
public class ThinkingInJava518 {
    public static void main(String[] args) {
        Test[] test = new Test[5];
        int i = 0;
        for (Test t : test) {
            t = new Test("" + i++);
        }
    }
}
