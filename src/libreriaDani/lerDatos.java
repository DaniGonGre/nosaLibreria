package libreriaDani;

import javax.swing.JOptionPane;

public class lerDatos {
    
    public static float lerFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static int lerInt(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static String lerString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
}
