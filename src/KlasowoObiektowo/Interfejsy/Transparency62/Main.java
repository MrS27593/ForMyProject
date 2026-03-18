package KlasowoObiektowo.Interfejsy.Transparency62;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Main {
    public static void main(String[] args) {
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        int transparency = bufferedImage.getColorModel().getTransparency();

        switch (transparency) {
            case Transparency.OPAQUE:
                System.out.println("Obraz jest nieprzezroczysty.");
                break;
            case Transparency.BITMASK:
                System.out.println("Obraz obsługuje przezroczystość binarną (bitmask).");
                break;
            case Transparency.TRANSLUCENT:
                System.out.println("Obraz obsługuje przezroczystość częściową (translucent).");
                break;
        }

    }
}
