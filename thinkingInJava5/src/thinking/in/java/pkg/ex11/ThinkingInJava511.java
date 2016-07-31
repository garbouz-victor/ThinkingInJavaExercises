package thinking.in.java.pkg.ex11;

/**
 *
 * @author Victor
 */
public class ThinkingInJava511 {
    
    public static void main(String[] args) {
        Test test = new Test();
        test = new Test();
        System.gc();
    }
}

class Test {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called.");
        super.finalize();
    }
    
}