package Tematycznie.GUI.AWT.CheckBox;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Dimension scrensize = Toolkit.getDefaultToolkit().getScreenSize();
        Frame frame = new Frame("Ramka");
        frame.setSize(scrensize.width,scrensize.height);
        frame.setVisible(true);

        System.out.println(scrensize.width);
        System.out.println(scrensize.height);

        Checkbox checkbox = new Checkbox("Java");
        checkbox.setBounds(100,100,40,20);
        Checkbox checkbox2 = new Checkbox("Python");
        checkbox2.setBounds(60,10,40,20);

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Java "+checkbox.getName()+checkbox.getState());
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Python: "+checkbox2.getState());
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.add(checkbox);
        frame.add(checkbox2);
    }
}
