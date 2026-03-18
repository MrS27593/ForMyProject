package Tematycznie.GUI.AWT.Choice846;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import static java.awt.Toolkit.getDefaultToolkit;

public class Main {
    public static void main(String[] args) {
        Dimension dimension = getDefaultToolkit().getScreenSize();
        int width = dimension.width;
        int hight = dimension.height;

        Frame frame = new Frame("Przykład Choice");

        Choice choice = new Choice();
        choice.add("gruszka");
        choice.add("mango");
        choice.add("jabłko");

        choice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Wybrano "+choice.getSelectedItem());
            }
        });

        frame.add(choice);
        frame.setSize(getDefaultToolkit().getScreenSize().width,getDefaultToolkit().getScreenSize().height);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        Random random = new Random();
        int liczba = random.nextInt(256);
        frame.setBackground(new Color((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256)));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        Button button = new Button("Zmniejsz okno");
        frame.add(button);
        button.setVisible(true);
        button.setEnabled(true);
        button.setBounds(30,30,50,60);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setSize(300,300);
                frame.getIconImage();
//                frame.
            }
        });
    }
}
