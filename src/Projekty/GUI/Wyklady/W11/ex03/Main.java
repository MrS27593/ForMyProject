package Projekty.GUI.Wyklady.W11.ex03;

import javax.swing.*;
import java.awt.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public Main(){

        JTable jTable = new JTable();

        jTable.setRowHeight(60);

        MyStudentModel model = new MyStudentModel();

        jTable.setModel(model);
        jTable.setDefaultRenderer(Color.class, new MyColorRenderer());
        jTable.setDefaultEditor(Color.class, new MyColorEditor());

        JScrollPane jScrollPane = new JScrollPane(jTable);

        this.add( jScrollPane);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
