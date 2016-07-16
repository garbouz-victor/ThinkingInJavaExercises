package thinking.in.java.pkg.ex10;

/**
 *
 * @author Victor
 */
public class ThinkingInJava310 {   
    
    public static void main(String[] args) {
        int a = 0x1010;
        int b = 0x0101;
        System.out.println("a = " + Integer.toBinaryString(a) 
                + " b = " + Integer.toBinaryString(b));
        a^=b;
        System.out.println("a^b = " + Integer.toBinaryString(a));
        System.out.println("~a = " + Integer.toBinaryString(~a));
        System.out.println("a|b = " + Integer.toBinaryString(a|b));
        System.out.println("a&b = " + Integer.toBinaryString(a&b));
    }
    
}
