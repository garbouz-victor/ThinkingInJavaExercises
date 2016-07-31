package thinking.in.java.pkg.ex8;

/**
 *
 * @author Victor
 */
public class ThinkingInbJava58 {
    
    public static void main(String[] args) {
        TestThis test = new TestThis();
        test.b();
        test.c();
    }
}
class TestThis {
    
    void a() {
        System.out.println("a method called!");
    }
    
    void b() {
        a();
    }
    
    void c() {
        this.a();
    }
}