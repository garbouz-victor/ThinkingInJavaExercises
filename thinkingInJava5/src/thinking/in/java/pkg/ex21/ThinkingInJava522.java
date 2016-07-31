package thinking.in.java.pkg.ex21;

/**
 *
 * @author Victor
 */
public class ThinkingInJava522 {
    public static void main(String[] args) {
        for (BANBKNAOTES b : BANBKNAOTES.values()) {
            switch(b) {
                case TEN_ROUBLES : {
                    System.out.println("10 RU");
                    break;
                }
                case HUNDRED_ROUBLES : {
                    System.out.println("100 RU");
                    break;
                }
                case FIVE_HUNDRED_ROUBLES : {
                    System.out.println("500 RU");
                    break;
                }
                case ONE_THOUSAND_OF_ROUBLES : {
                    System.out.println("1000 RU");
                    break;
                }
                case FIVE_THOUSAND_OF_ROUBLES : {
                    System.out.println("5000 RU");
                    break;
                }
            }
        }
    }
}
