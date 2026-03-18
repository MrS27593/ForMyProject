package Projekty.GUI.Wyklady.W10.ex01;

import javax.swing.*;
import javax.swing.event.ListDataListener;
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

        MyStringArrModel model = new MyStringArrModel();

        JComboBox jComboBox = new JComboBox(model);

        this.add(jComboBox);

        JButton jButton = new JButton("add");

        jButton.addActionListener(
            e -> {
                model.addElement("next element");
            }
        );

        this.add(jButton);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
