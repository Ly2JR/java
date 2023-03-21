package Section8;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Locale;

public class ListFonts {
    public static void main(String[] args) {
        GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames=env.getAvailableFontFamilyNames();
        System.out.println("可用字体:");
        for (int i=0;i<fontNames.length;i++){
            System.out.println(" "+fontNames[i]);
        }
    }
}
