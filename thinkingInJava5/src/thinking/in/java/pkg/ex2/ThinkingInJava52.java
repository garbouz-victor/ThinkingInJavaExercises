package thinking.in.java.pkg.ex2;

/**
 *
 * @author Victor
 */
public class ThinkingInJava52 {
    
    public static void main(String[] args) {
        TestInit t = new TestInit();
        System.out.println("str2 = " + t.str2);
    }
}

class TestInit {
    
    String str1 = "First str";
    String str2;
    
    public TestInit() {
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        str2 = "Second str";
    }
}
