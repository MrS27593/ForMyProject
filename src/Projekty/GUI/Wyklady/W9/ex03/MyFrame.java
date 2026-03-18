package Projekty.GUI.Wyklady.W9.ex03;

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

        this.getContentPane().setLayout(new FlowLayout());

        JComboBox jComboBox = new JComboBox(
            new String[] {
                "data 1",
                "data 2",
                "data 3",
                "data 4",
            }
        );

        this.add(jComboBox);

//        jComboBox.addActionListener(
//            e -> System.out.println(jComboBox.getSelectedItem())
//        );
//

        jComboBox.addItemListener(
            e -> {
                System.out.println(e);
//                jComboBox.addItem("test item");
            }
        );

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
