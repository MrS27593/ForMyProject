package Projekty.GUI.Wyklady.W10.ex02;

import Projekty.GUI.Wyklady.W10.ex01.data.Student;

import javax.swing.*;
import java.awt.*;

public
    class StudentRenderer
    implements ListCellRenderer<Student> {

    StudentPanel studentPanel = new StudentPanel();

    @Override
    public Component getListCellRendererComponent(JList<? extends Student> list, Student value, int index, boolean isSelected, boolean cellHasFocus) {

        if(value != null)
            studentPanel.setForStudent(value);
        if(isSelected)
            studentPanel.setBackground(Color.CYAN);
        else
            studentPanel.setBackground(
                new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
                )
            );
        return studentPanel;
    }
}
