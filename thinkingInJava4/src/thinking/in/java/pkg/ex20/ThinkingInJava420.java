package thinking.in.java.pkg.ex20;

/**
 *
 * @author Victor
 */
public class ThinkingInJava420 {
    
    static boolean test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(test(2, 0, 1));
        System.out.println(test(2, 0, 5));
    }
}
