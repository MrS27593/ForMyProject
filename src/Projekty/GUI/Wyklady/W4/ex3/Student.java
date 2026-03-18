package Projekty.GUI.Wyklady.W4.ex3;

//Publiczna klasa Student implementująca interfejs Comparable o szablonie Student
public
    class Student
    implements Comparable<Student> {

    //Prywatne pole "name" typu String
    private String name;
    //Prywatne pole "number" typu int
    private int number;

    //Publiczny konstruktor który przypisuje podane argumenty do pol
    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    //Przysłonięcie metody toString która jako String zwraca imie i numer
    @Override
    public String toString() {
        return name+" "+number;
    }

    //Przysłonięcie metody CompareTo która porównuje po numerach studentów
    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }

    //Publiczna metoda "getName", która zwraca imię
    public String getName() {
        return name;
    }

    //Publiczna metoda "getNumber"
    public int getNumber() {
        return number;
    }
}
