package thinking.in.java.pkg.ex24;

/**
 *
 * @author Victor
 */
public class ThinkingInJava424 {
    
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int a1 = i / 1000;
            int a2 = (i % 1000)/ 100;
            int a3 = (i % 100) / 10;
            int a4 = i % 10;
            tryVampire(a1, a2, a3, a4, i);
            tryVampire(a1, a3, a2, a4, i);
            tryVampire(a1, a3, a4, a2, i);
            tryVampire(a1, a4, a3, a2, i);
            
            tryVampire(a2, a1, a3, a4, i);
            tryVampire(a2, a3, a1, a4, i);
            tryVampire(a2, a3, a4, a1, i);
            tryVampire(a2, a4, a3, a1, i);
            
            tryVampire(a3, a1, a2, a4, i);
            tryVampire(a3, a2, a1, a4, i);
            tryVampire(a3, a2, a4, a1, i);
            tryVampire(a3, a4, a2, a1, i);
            
            tryVampire(a4, a2, a3, a1, i);
            tryVampire(a4, a3, a2, a1, i);
            tryVampire(a4, a3, a1, a2, i);
            tryVampire(a4, a1, a3, a2, i);
        }
    }
    
    static void print(int a1, int a2, int a3, int a4, int r) {
        System.out.println(a1 + "" + a2 + "x" + a3 + "" + a2 + "=" + r);           
    }
    static void tryVampire(int a1, int a2, int a3, int a4, int r) {
        if ((a1 * 10 + a2) * (a3 * 10 + a4) == r) {
            print(a1, a2, a3, a4, r);
        }
    }
}
