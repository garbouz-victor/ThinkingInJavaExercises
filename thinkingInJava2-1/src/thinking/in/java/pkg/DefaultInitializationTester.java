package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class DefaultInitializationTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultInitializer init = new DefaultInitializer();
        System.out.println("intValue = " + init.intValue 
                + " charValue = " + init.charValue);
        System.out.println("(int)charValue = " + (int)init.charValue);
    }
    
}
