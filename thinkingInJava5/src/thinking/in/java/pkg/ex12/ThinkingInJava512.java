package thinking.in.java.pkg.ex12;

/**
 *
 * @author Victor
 */
public class ThinkingInJava512 {
    
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.increaseLevel();
        tank.increaseLevel();
        tank.decreaseLevel();
        tank = new Tank();
        System.gc();
    }
}
class Tank {
    private int level;
    
    void increaseLevel() {
        level++;
        System.out.println("level = " + level);
    }
    
    void decreaseLevel() {
        level--;
        System.out.println("level = " + level);
    }

    @Override
    protected void finalize() throws Throwable {
        if (level != 0) {
            System.out.println("Warning! level = " + level);
        }
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    
}