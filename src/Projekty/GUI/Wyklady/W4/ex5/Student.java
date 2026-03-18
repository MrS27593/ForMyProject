package Projekty.GUI.Wyklady.W4.ex5;

public
    class Student {

    //prywatne pole "name" typu String
    private String name;
    //prywatne pole "number" typu int
    private int number;

    //Publiczny konstruktor przypisujący parametry do odpowiednich pól obiektów
    public Student(String name, int numebr) {
        this.name = name;
        this.number = numebr;
    }

    //Przysłonięcie metody "toString", która zwraca imie i numer
    @Override
    public String toString() {
        return name+" "+number;
    }

    //Publiczna metoda "getName" która zwraca imię
    public String getName() {
        return name;
    }

    //Publiczna metoda "getNumber", która zwraca numer
    public int getNumebr() {
        return number;
    }
}
