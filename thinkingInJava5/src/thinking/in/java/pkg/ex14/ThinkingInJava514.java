package thinking.in.java.pkg.ex14;

/**
 *
 * @author Victor
 */
public class ThinkingInJava514 {
    public static void main(String... args) {
        Test.printStrings();
    }
}
class Test {
    static String str1 = "This is frst string.";
    static String str2;
    static {
        str2 = "This is second string.";
    }
    static void printStrings() {
        System.out.println("str1 = " + str1 + " str2 = " + str2 + ".");
    }
}