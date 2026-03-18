package KlasowoObiektowo.Interfejsy.ActionListener54;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Proba");
        JButton jButton = new JButton("Kliknij");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknięto w przycisk");
                System.out.println(e.getActionCommand());
                System.out.println(e.getModifiers());
                System.out.println(e.getWhen());
                System.out.println(e.paramString());
                System.out.println(e.getSource());
                System.out.println(e.getID());
                System.out.println(e.toString());
                System.out.println(e.equals(this));
                System.out.println(e.hashCode());
                System.out.println(e.getClass());
            }
        });

        jFrame.add(jButton);
        jFrame.setSize(300,300);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        System.out.println();

        jButton.addActionListener(new MojListener());

        System.out.println();

        jButton.addActionListener(e-> System.out.println("LambdaYo!"));

        Timer timer = new Timer(1000,e-> System.out.println("Co sekundę"));
        timer.start();

        jButton.doClick();

    }
}
class MojListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Klik");
    }
}