package thinking.in.java.pkg.ex13;

/**
 *
 * @author Victor
 */
public class ThinkingInJava513 {
    public static void main(String... args) {
        TestStatic tester = TestStatic.test1;
    }
//    static TestStatic test = new TestStatic(0);
}

class TestStatic {
    static TestStatic test1;
    static TestStatic test2;
    static {
        test1 = new TestStatic(1);
        test2 = new TestStatic(2);
    }

    public TestStatic(int identifier) {
        System.out.println("TestStatic() caled. " + identifier);
    }
    
}