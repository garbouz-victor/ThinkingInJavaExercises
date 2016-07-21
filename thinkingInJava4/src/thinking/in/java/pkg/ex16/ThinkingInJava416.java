package thinking.in.java.pkg.ex16;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Victor
 */
public class ThinkingInJava416 {
    
    public static int endValue = 25;
    public static int bound = 100;
    
    public static void main(String[] args) {
        Random generator = new Random(new Date().getTime());
        int previousValue = generator.nextInt(bound);
        int currentValue;
        for (int i = 1; i <= endValue; i++) {
            currentValue = generator.nextInt(bound);
            if (currentValue >= previousValue) {
                System.out.println(currentValue + " => " + previousValue);
            } else {
                System.out.println(currentValue + " < " + previousValue);
            }
            previousValue = currentValue;
        }
    }
    
}
