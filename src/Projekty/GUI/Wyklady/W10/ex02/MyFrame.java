package Projekty.GUI.Wyklady.W10.ex02;
import Projekty.GUI.Wyklady.W10.ex01.MyModel;
import Projekty.GUI.Wyklady.W10.ex01.MyStringArrModel;
import Projekty.GUI.Wyklady.W10.ex01.data.Student;

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

        MyModel<Student> studentMyModel = new MyModel<>();

        Student stud = new Student("Jan", "Xksinsi", 1701);

        studentMyModel.addElement(stud);
        studentMyModel.addElement(
            new Student("Ala", "Ygrekowa", 23456)
        );


        JComboBox jComboBox = new JComboBox(studentMyModel);
        jComboBox.setRenderer(new StudentRenderer());
        this.add(jComboBox);

        StudentPanel studentPanel = new StudentPanel();
        studentPanel.setForStudent(stud);
        this.add(studentPanel);
//
//        JButton jButton = new JButton("add");
//
//        jButton.addActionListener(
//            e -> {
//                model.addElement("next element");
//            }
//        );

//        this.add(jButton);

        this.setSize( 640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
