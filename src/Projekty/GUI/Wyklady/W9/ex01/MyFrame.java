package Projekty.GUI.Wyklady.W9.ex01;

import javax.swing.*;
import java.awt.*;

public
    class MyFrame
    extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            () -> new MyFrame()
        );
    }

    public MyFrame(){
        JPanel cPanel = new JPanel();

        MyPanel generator = new MyPanel(true);

        generator.addColorListener(
            new ColorListener() {
                int counter = 0;
                @Override
                public void onColorChanged(ColorChangedEvent evt) {
                    System.out.println("color changed("+(counter++)+")");
                    System.out.println(evt);
                    System.out.println(evt.getColor());
                }
            }
        );

        cPanel.add(generator);

        JButton jButton = new JButton("^");
        jButton.addActionListener(
            e -> generator.setBackground(Color.RED)
        );
        cPanel.add(jButton);

        this.add(cPanel);

        JPanel dPanel = new JPanel();

        MyPanel mp1 = new MyPanel(false);
        MyPanel mp2 = new MyPanel(false);
        MyPanel mp3 = new MyPanel(false);
        MyPanel mp4 = new MyPanel(false);

        generator.addColorListener(mp1);
        mp1.addColorListener(mp2);
        mp2.addColorListener(mp3);
        mp3.addColorListener(mp4);

        dPanel.add(mp1);
        dPanel.add(mp2);
        dPanel.add(mp3);
        dPanel.add(mp4);

        this.add(dPanel, BorderLayout.PAGE_END);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
