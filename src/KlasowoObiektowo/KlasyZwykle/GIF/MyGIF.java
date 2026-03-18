package KlasowoObiektowo.KlasyZwykle.GIF;

import javax.swing.*;
import java.awt.*;

public class MyGIF {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Animated gif");
        jFrame.setBackground(Color.BLUE);

        ImageIcon imageIcon = new ImageIcon("animation.gif");
        imageIcon.setDescription("tutaj jest opis gifa");

        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBackground(Color.CYAN);

        jFrame.add(jLabel);
        jFrame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().setBackground(Color.BLUE);
        jFrame.setVisible(true);
    }
}
