package Projekty.GUI.Wyklady.W4.ex4;

public
    class Student {

    //prywatne pole "name" typu String
    private String name;
    //prywatne pole "number" typu int
    private int number;

    //konstruktor przypisujący parametry do odpowiednich pól obiektów
    public Student(String name, int numebr) {
        this.name = name;
        this.number = numebr;
    }

    //Przysłonięcie metody toString która zwracać będzie imię i numer
    @Override
    public String toString() {
        return name+" "+number;
    }
}
