package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class ThinkingInJava26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Storage st = new Storage();
        System.out.println("Storage for string \"Hello world!\" should consist of " 
                + st.storage("Hello world!") + " bytes.");
    }
    
}

class Storage {
    int storage(String s) {
        return s.length() * 2;
    }
}