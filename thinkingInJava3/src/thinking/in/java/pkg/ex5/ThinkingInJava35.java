package thinking.in.java.pkg.ex5;

/**
 *
 * @author Victor
 */
public class ThinkingInJava35 {
    
    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Hi from spot!");
        Dog scruffy = new Dog("scruffy", "Hi from scruffy!");
        System.out.println(spot.name + " " + spot.says);
        System.out.println(scruffy.name + " " + scruffy.says);
    }
    
}
