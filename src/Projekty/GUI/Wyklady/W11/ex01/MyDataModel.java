package Projekty.GUI.Wyklady.W11.ex01;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public
    class MyDataModel
    extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return (rowIndex+1) * (columnIndex+1);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;
    }
}
