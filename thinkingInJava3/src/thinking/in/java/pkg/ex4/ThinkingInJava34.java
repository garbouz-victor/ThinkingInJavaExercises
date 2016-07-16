package thinking.in.java.pkg.ex4;

/**
 *
 * @author Victor
 */
public class ThinkingInJava34 {
    
    static double getTheSpeed(double distance, double time) {
        return distance / time;
    }
    
    public static void main(String[] args) {
        System.out.println("For distance = 100 meters and time = 9.8 "
                + "seconds the speed is = " + getTheSpeed(0.1, 0.00272) + " km in hour.");
    }
}
