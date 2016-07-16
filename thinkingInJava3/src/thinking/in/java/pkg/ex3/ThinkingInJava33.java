package thinking.in.java.pkg.ex3;

import thinking.in.java.pkg.ex2.TestAliasing;

/**
 *
 * @author Victor
 */
public class ThinkingInJava33 {
    
    public static void main(String[] args) {
        TestAliasing t = new TestAliasing();
        System.out.println("t.v = " + t.v);
        TestAliasing2.function(t);
        System.out.println("t.v = " + t.v);
    }
}
