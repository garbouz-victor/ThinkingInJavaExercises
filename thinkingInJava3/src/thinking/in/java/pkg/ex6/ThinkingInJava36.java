package thinking.in.java.pkg.ex6;

import thinking.in.java.pkg.ex5.Dog;

/**
 *
 * @author Victor
 */
public class ThinkingInJava36 {
    
    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Hi from spot!");
        Dog refToSpot = spot;
        System.out.println("refToSpot == spot " + (refToSpot == spot));
        System.out.println("refToSpot.equals(spot) " + (refToSpot.equals(spot)));
    }
    
}
