package Projekty.GUI.Wyklady.W4.ex6;

import java.util.Objects;

public
    class Student {

    //prywatne pole "name" typu String
    private String name;
    //prywatne pole "number" typu int
    private int numebr;

    //Publiczny konstruktor przypisujący parametry do odpowiednich pól obiektów
    public Student(String name, int numebr) {
        this.name = name;
        this.numebr = numebr;
    }

    //Przysłonięcie metody "toString", która zwraca imie i numer
    @Override
    public String toString() {
        return name+" "+numebr;
    }

    //Publiczna metoda "getName", która zwraca imię
    public String getName() {
        return name;
    }

    //Publiczna metoda "getNumber", która zwraca numer
    public int getNumebr() {
        return numebr;
    }

    //Przysłonięcie metody "equals", która zwraca booleana czy obiekty są sobie równe
    @Override
    public boolean equals(Object o) {
        //Jeżeli obiekt jest równy argumentowi od razu zwróć true
        if (this == o) return true;
        //Jeżeli obiekt jest null lub jest innej klasy zwróć false
        if (o == null || getClass() != o.getClass()) return false;
        //Sztuczne zrzutowanie obiektu na klasę Student
        Student student = (Student) o;
        // sprawdzenie czy numer obiektu jest taki sam jak numer argumentu i metodą equals z klasy Obiects sprawdzenie czy imona są takie same
        return numebr == student.numebr && Objects.equals(name, student.name);
    }

    //Przysłonięcie metody "hasCode" które zwraca inta jako unikalny hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, numebr);
    }
}
