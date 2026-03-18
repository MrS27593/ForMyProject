package Projekty.GUI.Wyklady.W8.ex2;

import javax.swing.*;
import java.awt.*;

public
class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();

                    JLabel jLabel = new JLabel("text");
                    jLabel.setLocation( 30, 30);
                    jLabel.setSize(new Dimension( 100, 30));
                    JButton jButton = new JButton("click");
                    jButton.setLocation( 130, 30);
                    jButton.setSize(new Dimension( 100, 30));

                    jFrame.getContentPane().setLayout(null);
                    jFrame.getContentPane().add(jLabel);
                    jFrame.getContentPane().add(jButton);

                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrame.setVisible(true);
                    jFrame.pack();
                }
        );
    }
}
