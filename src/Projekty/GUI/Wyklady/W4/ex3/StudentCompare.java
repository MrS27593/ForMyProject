package Projekty.GUI.Wyklady.W4.ex3;

import java.util.Comparator;

//Publiczna klasa StudentCompare implementująca interfejs Comparator o szablonie <Student>
public
    class StudentCompare
    implements Comparator<Student> {

    //Dwie publiczne statyczne finalne zmiennej typu int
    public static final int BY_NUMBER = 0,
        BY_NAME = 1;

    //Publiczny enum zawierający w sobie dwa enumy
    public enum SortType{
        BY_NUMBER, BY_NAME
    }

    //Prywatne pole "sortBy"
    private SortType sortBy;

    //publiczny Konstruktor klasy przypisuje argument do pola sortBy
    public StudentCompare(SortType sortBy) {
        this.sortBy = sortBy;
    }

    //Przysłonięcie metody compare, używając switcha w zależności jaki podany jest sortBY to sortuje po numerze lub po imieniu.
    @Override
    public int compare(Student o1, Student o2) {
        return switch (sortBy){
            case BY_NUMBER -> o1.getNumber() - o2.getNumber();
            case BY_NAME -> o1.getName().compareTo(o2.getName());
        };
    }
}
