package thinking.in.java.pkg;

/**
 *
 * @author Victor
 */
public class ThinkingInJava211 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow r = new AllTheColorsOfTheRainbow();
        r.changeTheHueOfTheColor(7);
    }
    
}

class AllTheColorsOfTheRainbow {
    
    int anIntegerRepresentingColors;
    
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
    
}