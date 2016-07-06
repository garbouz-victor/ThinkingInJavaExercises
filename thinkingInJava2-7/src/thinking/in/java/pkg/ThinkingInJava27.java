package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class ThinkingInJava27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("i = " + StaticTest.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("i = " + StaticTest.i);
        Incrementable.increment();
        System.out.println("i = " + StaticTest.i);
    }
    
}

class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }
}
