package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class ThinkingInJava29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 0;
       Integer ii = 1;
       System.out.println("0 = 1 " + ii.equals(i));
       System.out.println("1 = 1 " + ii.equals(++i));
    }
    
}
