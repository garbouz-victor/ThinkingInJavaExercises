package thinking.in.java.pkg.ex17;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Victor
 */
public class ThinkingInJava417 {    
    public static int bound = 100;
    
    public static void main(String[] args) {
        Random generator = new Random(new Date().getTime());
        int previousValue = generator.nextInt(bound);
        int currentValue;
        while(true) {
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
