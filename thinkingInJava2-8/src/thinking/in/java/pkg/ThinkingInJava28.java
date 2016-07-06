package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class ThinkingInJava28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        st1.i++;
        System.out.println("st1.i = " + st1.i 
                + " st2.i = " + st2.i 
                + " st3.i = " + st3.i);
    }
    
}

class StaticTest {
    static int i = 0;
}
