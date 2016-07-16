package thinking.in.java.pkg.ex12;

/**
 *
 * @author Victor
 */
public class ThinkingInJava312 {
    
    public static void main(String[] args) {
        int i = Integer.parseInt("01111111", 2);
        System.out.println("i = " + Integer.toBinaryString(i));
        i <<= 1;
        System.out.println("i = " + Integer.toBinaryString(i));
        while (i > 0 ) {            
            i >>= 1;
            System.out.println("i = " + Integer.toBinaryString(i));
        }
    }
}
