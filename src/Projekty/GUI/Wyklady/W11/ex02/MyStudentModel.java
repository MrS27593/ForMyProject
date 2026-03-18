package Projekty.GUI.Wyklady.W11.ex02;

import Projekty.GUI.Wyklady.W11.data.Student;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public
    class MyStudentModel
    extends AbstractTableModel {

    private List<Student> students;

        public MyStudentModel() {
            this.students = new ArrayList<>();
            this.students.add(
                new Student("Jean Luc", "Picard", 1701)
            );
            this.students.add(
                new Student("Ben", "Sisco", 9)
            );
            this.students.add(
                new Student("Kathrin", "janeway", 75654)
            );
        }

    @Override
    public int getRowCount() {
        return this.students.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = this.students.get(rowIndex);
        return switch (columnIndex){
            case 0 -> student.getName();
            case 1 -> student.getSurname();
            case 2 -> student.getsNumber();
            default -> "empty";
        };
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex){
            case 0, 1 -> String.class;
            case 2 -> Integer.class;
            default -> super.getColumnClass(columnIndex);
        };
    }

    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex){
            case 0 -> "Imie";
            case 1 -> "Nazwisko";
            case 2 -> "s-ka";
            default -> super.getColumnName(columnIndex);
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Student student = this.students.get(rowIndex);
        switch (columnIndex){
            case 0 -> student.setName((String)aValue);
            case 1 -> student.setSurname((String)aValue);
            case 2 -> student.setsNumber(Integer.parseInt(aValue.toString()));
        }
        System.out.println(aValue);
    }
}
