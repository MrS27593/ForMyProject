package KlasowoObiektowo.Interfejsy.ItemSelectable68;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("ItemSelectable");
        Checkbox checkbox = new Checkbox("Zaznacz mnie");

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                ItemSelectable source = e.getItemSelectable();
                Object[] objects = source.getSelectedObjects();
                if(objects!=null){
                    System.out.println("Wybrano "+objects[0]);
                }else {
                    System.out.println("nic nie wybrano");
                }
            }
        });

        frame.add(checkbox);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
