package thinking.in.java.pkg.ex16;

/**
 *
 * @author Victor
 */
public class ThinkingInJava516 {
    public static void main(String... args) {
        String[] strs = new String[5];
        String temp = "Temp string.";
        strs[0] = strs[1] = strs[2] = strs[3] = strs[4] = temp;
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
