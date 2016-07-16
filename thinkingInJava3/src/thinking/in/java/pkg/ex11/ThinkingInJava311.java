package thinking.in.java.pkg.ex11;

/**
 *
 * @author Victor
 */
public class ThinkingInJava311 {
    
    public static void main(String[] args) {
        int i = 0x1f;
        System.out.println("i = " + Integer.toBinaryString(i));
        while (i > 0 ) {            
            i >>= 1;
            System.out.println("i = " + Integer.toBinaryString(i));
        }
    }
}
