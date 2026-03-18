package Projekty.GUI.Wyklady.W10.ex01;

import javax.swing.*;
import javax.swing.event.ListDataListener;

public
    class MyStringArrModel
    extends DefaultComboBoxModel<String>{

    String[] data = new String[] {
        "data 1",
        "data 2",
        "data 3",
        "data 4",
    };

    @Override
    public int getSize() {
        return data.length;
    }

    @Override
    public String getElementAt(int index) {
        return data[index];
    }

    @Override
    public void addElement(String anObject) {
        String[] tmp = new String[data.length+1];
        for(int i=0; i< data.length; i++)
            tmp[i] = data[i];
        tmp[tmp.length-1] = anObject;
        this.data = tmp;
    }
}