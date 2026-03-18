package KlasowoObiektowo.Interfejsy.Clonable54Done;

public class Main {
    public static void main(String[] args) {
        try {
            // Tworzenie obiektu
            Osoba osoba1 = new Osoba("Jan", 30);

            // Klonowanie obiektu
            Osoba osoba2 = (Osoba) osoba1.clone();

            // Wyświetlanie oryginalnego obiektu i jego kopii
            osoba1.wypisz(); // Imię: Jan, Wiek: 30
            osoba2.wypisz(); // Imię: Jan, Wiek: 30

            System.out.println();

            // Zmiana imienia w kopii
            osoba2.imie = "Kamil";

            // Sprawdzenie czy zmiana w kopii wpływa na oryginał
            osoba1.wypisz(); // Imię: Jan, Wiek: 30
            osoba2.wypisz(); // Imię: Kamil, Wiek: 30
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class Osoba implements Cloneable {
    String imie;
    int wiek;

    // Konstruktor
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    // Nadpisanie metody clone() aby obsługiwała wyjątek
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // wywołanie metody clone() z klasy Object
    }

    // Metoda do wypisywania danych
    public void wypisz() {
        System.out.println("Imię: " + imie + ", Wiek: " + wiek);
    }
}

class Person implements Cloneable{
    String[] names;
    Person(String[] names){
        this.names = names;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person kopia = (Person) super.clone();
        kopia.names = this.names.clone();
        return kopia;
    }
}



