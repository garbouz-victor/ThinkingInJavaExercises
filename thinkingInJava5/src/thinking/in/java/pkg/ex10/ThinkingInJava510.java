package thinking.in.java.pkg.ex10;

/**
 *
 * @author Victor
 */
public class ThinkingInJava510 {
    public static void main(String[] args) {
        TestFinalize test = new TestFinalize();
    }
}
class TestFinalize {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called.");
        super.finalize();
    }
    
}