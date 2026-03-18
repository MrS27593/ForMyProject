package Projekty.GUI.Wyklady.W8.ex1;

import javax.swing.*;

public
class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();

                    JLabel jLabel = new JLabel("text");
                    JButton jButton = new JButton("click");

                    jFrame.getContentPane().add(jLabel);
                    jFrame.getContentPane().add(jButton);

                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrame.setVisible(true);
                    jFrame.pack();
                }
        );
    }
}
