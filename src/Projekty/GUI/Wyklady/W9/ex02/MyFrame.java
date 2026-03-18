package Projekty.GUI.Wyklady.W9.ex02;
import Projekty.GUI.Wyklady.W9.ex01.ColorChangedEvent;
import Projekty.GUI.Wyklady.W9.ex01.ColorListener;
import Projekty.GUI.Wyklady.W9.ex01.MyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public
    class MyFrame
    extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            () -> new MyFrame()
        );
    }

    public MyFrame(){

        JPanel largeGraphicsPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Random random = new Random(1000);
                for(int i=0; i<2000; i+=10){
                    for(int j=0; j<2000; j+=10){
                        g.setColor(new Color(random.nextInt()));
                        g.fillRect( i, j, 10, 10);
                    }
                }
            }
        };
        largeGraphicsPanel.setPreferredSize(new Dimension( 3000, 3000));

        largeGraphicsPanel.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        System.out.println(e.getX()+" "+e.getY());
                    }
                }
        );

        JScrollPane jScrollPane = new JScrollPane(largeGraphicsPanel);
        this.add(jScrollPane);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
