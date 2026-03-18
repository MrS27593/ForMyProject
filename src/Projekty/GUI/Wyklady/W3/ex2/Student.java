package Projekty.GUI.Wyklady.W3.ex2;

//Publiczna klasa "Student"
public
    class Student {

    //Prywatne pole "name" typu String
    private String name;
    //Prywatne pole "number" typu int
    private int numebr;

    //Publiczny konstruktor przyjmujący dwa argumenty i przypisuje je odpowiednio do pól
    public Student(String name, int numebr) {
        this.name = name;
        this.numebr = numebr;
    }

    //Przysłonięcie metody toString, która zwraca imie i numer
    @Override
    public String toString() {
        return name+" "+numebr;
    }
}
