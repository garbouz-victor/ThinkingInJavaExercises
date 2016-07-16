package thinking.in.java.pkg.ex7;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Victor
 */
public class ThinkingInJava37 {
    
    public static void main(String[] args) {
        Coin c = new Coin();
        System.out.println("result:" + c.drop());
        System.out.println("second result:" + c.drop());
    }
}

class Coin {
    
    Random r = new Random(new Date().getTime());
    
    boolean drop() {
        return r.nextInt(2) % 2 == 0;
    }
}
