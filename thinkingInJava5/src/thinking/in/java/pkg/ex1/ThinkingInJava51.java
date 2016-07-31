package thinking.in.java.pkg.ex1;

/**
 *
 * @author Victor
 */
public class ThinkingInJava51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestStringInit t = new TestStringInit();
        if (t.str == null) {
            System.out.println("str == null!");
        }
    }
    
}

class TestStringInit {
    String str;
}
