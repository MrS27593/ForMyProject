package Projekty.GUI.Wyklady.W10.ex01;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public
    class MyModel<T>
    extends DefaultComboBoxModel<T> {

    private List<T> data;

    public MyModel() {
        this.data = new ArrayList<>();
    }

    @Override
    public void addElement(T anObject) {
        data.add(anObject);
    }

    @Override
    public int getSize() {
        return this.data.size();
    }

    @Override
    public T getElementAt(int index) {
        return this.data.get(index);
    }
}
