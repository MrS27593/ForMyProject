package Projekty.GUI.Wyklady.W3.ex4;

//Publiczna klasa "Student" implementująca interfejs Comparable o szablonie <Student>. Dobrą praktyką implementując Comparable jest zawsze podawanie szablonu
public
    class Student
    implements Comparable<Student> {

    //Prywatne pole "name" typu String
    private String name;
    //Prywatne pole number typu int
    private int numebr;

    //Publiczny Konstruktor przyjmujący dwa argumenty i przypisujące te wartości do pól
    public Student(String name, int numebr) {
        this.name = name;
        this.numebr = numebr;
    }

    //Przysłonięta metoda toString zwracająca Stringa w postaci imienia i nazwiska.
    @Override
    public String toString() {
        return name+" "+numebr;
    }

    //Przysłonięta metoda compareTo która przyjmuje jeden argument typu taki jak w szablonie i zwracający różnicę pomiędzy podanym argumentem o polem obiektowym
    @Override
    public int compareTo(Student o) {
        return this.numebr - o.numebr;
    }

    //"getName" która zwracać będzie pole name
    public String getName() {
        return name;
    }

    //"getNumebr", która zwracać będzie pole number
    public int getNumebr() {
        return numebr;
    }
}
