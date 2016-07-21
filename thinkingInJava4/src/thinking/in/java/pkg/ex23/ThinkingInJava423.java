package thinking.in.java.pkg.ex23;

/**
 *
 * @author Victor
 */
public class ThinkingInJava423 {
    static int fibonacci(int v) {
        int i1 = 1;
        int i2 = 1;
        int temp;
        int i = 3;
        while (v >= i) {
            temp = i2;
            i2 = i1 + i2;
            i1 = temp;
            i++;
        }
        return i2;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
