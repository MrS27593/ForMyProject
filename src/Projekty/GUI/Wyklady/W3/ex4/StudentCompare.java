package Projekty.GUI.Wyklady.W3.ex4;

import java.util.Comparator;

//Publiczna klasa StudentCompare implementująca Comparator o szablonie <Students>
public
    class StudentCompare
    implements Comparator<Student> {

    //publiczne statyczne, finalne pole  "BY_NUMBER" o wartości 0 i "BY_NAME" o wartości 1
    public static final int BY_NUMBER = 0,
        BY_NAME = 1;

    //Prywatne pole "sortBy" typu int
    private int sortBy;

    //Konstruktor przypisuje podany argument do pola "sortBy"
    public StudentCompare(int sortBy) {
        this.sortBy = sortBy;
    }

    //Przysłonięcie metody "compare" która porównuje dwóch studentów
    @Override
    public int compare(Student o1, Student o2) {
        //Za pomocą return i switch w zależności od podanego sposobu sortowania będziemy otrzymywać różne wyniki, sposoby sortowania
        return switch (sortBy){
            case 0 -> o1.getNumebr() - o2.getNumebr();
            case 1 -> o1.getName().compareTo(o2.getName());
            //Jeżeli podany coś innego niż 0 lub 1 to domyślnie traktuj jako 0 czyli segreguj po numerze
            default -> 0;
        };
    }
}
