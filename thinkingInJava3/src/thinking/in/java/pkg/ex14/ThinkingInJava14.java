package thinking.in.java.pkg.ex14;

/**
 *
 * @author Victor
 */
public class ThinkingInJava14 {
    
    static void stringTester(String str1, String str2) {
        System.out.println(str1 + " == " + str2 + " " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + " " + (str1 != str2));
        System.out.println(str1 + ".equals(" + str2 + ")" + " " + str1.equals(str2));
    }
    
    public static void main(String[] args) {
        stringTester("a test", "a test");
        stringTester("b", "b_b");
        String str = "tets";
        stringTester(str, str);
    }
}
