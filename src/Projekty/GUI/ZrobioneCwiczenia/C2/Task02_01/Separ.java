package FinalneMarcinaIMoje.Task02_01;

//Klasa Separ implementująca interfejs funkcyjny TwoStringsOper
abstract class Separ
        implements TwoStringsOper {
    //Prywatne pole "s" typu String
    private String s;
    //Konstruktor przyjmuje Stringa i przypisuje go do pola
    public Separ(String s) {
        this.s=s;
    }
    //Przysłonięta metoda apply zwraca nowego Stringa z podanym argumentem po środku
    @Override
    public String apply(String one, String two) {;
        String a = "";
        a= one + two;
        String d = one + s + two;
        return d;
    }
}