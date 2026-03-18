package Projekty.GUI.Wyklady.W10.ex02;

import Projekty.GUI.Wyklady.W10.ex01.data.Student;

import javax.swing.*;
import java.awt.*;

public
    class StudentPanel
    extends JPanel {

    JLabel lName;
    JTextField fName;
    JLabel lSurname;
    JTextField fSurname;
    JLabel lSNumber;
    JTextField fSNumber;

    static int count = 0;

    public StudentPanel() {
        System.out.println("tu"+(count++));
        this.setLayout(new GridLayout( 3, 2));

        lName = new JLabel("Name: ");
        fName = new JTextField();
        lSurname = new JLabel("Surname: ");
        fSurname = new JTextField();
        lSNumber = new JLabel("number: ");
        fSNumber = new JTextField();

        this.add(lName);
        this.add(fName);
        this.add(lSurname);
        this.add(fSurname);
        this.add(lSNumber);
        this.add(fSNumber);
    }

    public void setForStudent(Student stud){
        fName.setText(stud.getName());
        fSurname.setText(stud.getSurname());
        fSNumber.setText(""+stud.getsNumber());
    }
}
