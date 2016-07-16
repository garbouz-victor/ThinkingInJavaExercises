package thinking.in.java.pkg.ex2;

/**
 *
 * @author Victor
 */
public class ThinkingInJava32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestAliasing t1 = new TestAliasing();
        TestAliasing t2 = new TestAliasing();
        System.out.println("t1.v = " + t1.v + " t2.v = " + t2.v);
        t2.v = 17f;
        System.out.println("t1.v = " + t1.v + " t2.v = " + t2.v);
        t1 = t2;
        System.out.println("t1.v = " + t1.v + " t2.v = " + t2.v);
    }
    
}
