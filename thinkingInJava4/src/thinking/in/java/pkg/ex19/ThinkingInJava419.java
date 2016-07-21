package thinking.in.java.pkg.ex19;

/**
 *
 * @author Victor
 */
public class ThinkingInJava419 {
    
    public static void main(String[] args) {
        binaryPrinter(17);
    }
    
    public static void binaryPrinter(int v) {
        int pow = 0;
        while (Math.pow(2, pow) < v) {
            pow++;
        }        
        for (int i = pow; i >=0; i--) {
            System.out.print((int)(v/Math.pow(2, i)));
            v = (int) (v % Math.pow(2, i));
        }
        System.out.println();
    }
}
