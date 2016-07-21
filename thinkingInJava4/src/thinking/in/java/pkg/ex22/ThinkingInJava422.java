package thinking.in.java.pkg.ex22;

/**
 *
 * @author Victor
 */
public class ThinkingInJava422 {
    
    enum Message {TEST_MESSAGE_1, TEST_MESSAGE_2, TEST_MESSAGE_3};
    
    public static void main(String[] args) {
        for (Message m : Message.values()) {
            switch (m) {
                case TEST_MESSAGE_1 : {System.out.println("TEST_MESSAGE_1");break;}
                case TEST_MESSAGE_2 : {System.out.println("TEST_MESSAGE_2");break;}
                case TEST_MESSAGE_3 : {System.out.println("TEST_MESSAGE_3");break;}
            }
        }
    }
}
