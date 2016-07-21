package thinking.in.java.pkg.ex18;

/**
 *
 * @author Victor
 */
public class ThinkingInJava418 {
    
    public static void main(String[] args) {
        boolean flag = false;
        for(int i = 2;;i++) {
            flag = false;
            for (int j = 2; j < i/2 + 1; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i + " is a prime number.");
            }
        }
    }
    
}
