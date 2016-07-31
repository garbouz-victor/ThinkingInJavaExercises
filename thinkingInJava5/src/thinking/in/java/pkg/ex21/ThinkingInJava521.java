package thinking.in.java.pkg.ex21;

/**
 *
 * @author Victor
 */
enum BANBKNAOTES {
    TEN_ROUBLES,
    HUNDRED_ROUBLES,
    FIVE_HUNDRED_ROUBLES,
    ONE_THOUSAND_OF_ROUBLES,
    FIVE_THOUSAND_OF_ROUBLES
}; 
public class ThinkingInJava521 {
    public static void main(String... args) {
        for (BANBKNAOTES b : BANBKNAOTES.values()) {
            System.out.println(b + " " + b.ordinal());
        }
    }
}
