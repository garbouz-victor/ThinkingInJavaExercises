package thinking.in.java.pkg.ex13;

/**
 *
 * @author Victor
 */
public class ThinkingInJava313 {
    public static void charToBinary(char c) {
        byte b = 7;
        while (b >= 0) {
            System.out.print((int) (c/(Math.pow(2, b))));
            c -= (int)(c/Math.pow(2, b)) * Math.pow(2, b);
            b -= 1;
        }        
    }
    public static void main(String[] args) {
        charToBinary('a');
        System.out.println("\n");
    }
}
