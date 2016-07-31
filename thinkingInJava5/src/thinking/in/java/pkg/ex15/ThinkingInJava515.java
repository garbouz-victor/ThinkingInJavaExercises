package thinking.in.java.pkg.ex15;

/**
 *
 * @author Victor
 */
public class ThinkingInJava515 {
    public static void main(String... args) {
        Tests test = new Tests();
        Test test1 = test.test1;
        Test tes2 = test.test2;
    }
}
class Test {
    Test(int identifier) {
        System.out.println("Test " + identifier);
    }
}
class Tests {
    Test test1;
    Test test2;
    //init section
    {
        test1 = new Test(1);
        test2 = new Test(2);
    }
}