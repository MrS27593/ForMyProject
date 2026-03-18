package Projekty.GUI.Wyklady.W9.ex04;

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

        this.getContentPane().setLayout(new FlowLayout());

        JList jList = new JList(
            new String[] {
                "data 1",
                "data 2",
                "data 3",
                "data 4",
            }
        );

        this.add(jList);

//        jComboBox.addActionListener(
//            e -> System.out.println(jComboBox.getSelectedItem())
//        );
//

        JButton jButton = new JButton("^");
        jButton.addActionListener(
            e -> System.out.println(jList.getSelectedValuesList())
        );

        this.add(jButton);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
