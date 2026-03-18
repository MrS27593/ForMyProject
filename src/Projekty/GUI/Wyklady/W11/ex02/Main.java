package Projekty.GUI.Wyklady.W11.ex02;

import Projekty.GUI.Wyklady.W11.ex01.MyDataModel;

import javax.swing.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    public Main(){

        JTable jTable = new JTable();

        MyStudentModel model = new MyStudentModel();

        jTable.setModel(model);

        JScrollPane jScrollPane = new JScrollPane(jTable);

        this.add( jScrollPane);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
