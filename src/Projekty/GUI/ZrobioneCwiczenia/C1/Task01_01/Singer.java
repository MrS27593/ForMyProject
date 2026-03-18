package FinalneMarcinaIMoje.Task01_01;

abstract class Singer {

    //Prywatne statyczna zmienna która zainicjowana jest na początku wartością 1
    private static int nextId=1;
    //Pole "imie" typu String protected
    protected String imie;
    //Pole "numer" typu int protected
    protected int numer;

    //Publiczny konstruktor który przypisuje podany argument do pól obietowych, Konstrukto przyjmując tylko jeden argument typu String oddziałuje równiesz na pole numer za pomocą inkrementacji zmiennej statycznej
    public Singer(String imie) {
        this.imie = imie;
        this.numer = nextId++;
    }

    //Getter zwracający imię
    public String getImie() {
        return imie;
    }
    //Getter zwracający numer
    public int getNumer() {
        return numer;
    }

    //Publiczna abstrakcyjna metoda "sing" zwracająca Stringa, później bedzie ona przysłaniana
    public abstract String sing();

    //Przysłonięcie toStringa tak aby zwracał nie pamięć a to co chcemy czyli imie i numer
    @Override
    public String toString() {
        return "(" + numer +")"+ imie+": "+sing();
    }

    //Publiczna statyczna metoda "loudest" zwracająca Singera
    public static Singer loudest(Singer[] singers) {
        //Ustawienie że jest jakiś Singer który jest najgłośniejszy
        Singer najgłośniejszy = null ; // singers[0] ale w momencie, kiedy tablica nie jest 0
        //Zainicjalizowanie zmiennej która będzie pokazywała ile jest największych Liter w tekscie piosenki która zawiera włoścnie najwięcej dużych liter
        int najwiekszaLiczbaWielkich = 0;

        //Przzechodzimy po kolejnych obiektach Typu Singer z tablicy podanej jako argument
        for (Singer a : singers) {
            //Piosenkta typ String to String zwracany z metody sing dla każdego elemntu
            String piosenka = a.sing();
            // Do stworzonej zmiennej przypisujemy zwracany int ilość dużych liter dla konkretnej piosenki
            int liczbaWielkichLiter = obliczIleWielkichLiter(piosenka);
            //Jeżeli nowa liczba wielkich liter jest większa niż obecna największa liczba wielkich liter to obiektem najgłośniejszym jest element a i zmieniamy przypisanie zmiennej największaliczba
            if (liczbaWielkichLiter > najwiekszaLiczbaWielkich) {
                najgłośniejszy = a;
                najwiekszaLiczbaWielkich = liczbaWielkichLiter;
            }
        }
        //Zwracamy obiekt typu Singer który jest najgłośniejszy to znaczy zaweira najwięcej dużych liter
        return najgłośniejszy;
    }

    private static int obliczIleWielkichLiter(String Piosenka) {
        //Ustawienia licznika na 0
        int licznik = 0;
        //Przechodzimy po każdej literce z tablicy liter która wcześniej zmieniliśmy ze Stringa za pomocą metody toCharArray()
        for (char a : Piosenka.toCharArray()) {
            //Jeżeli element a jest UpperCase (metoda z Klasy Character) to zwiększamy licznik o 1
            if (Character.isUpperCase(a)) {
                licznik++;
            }
        }
        //Zwracamy licznik
        return licznik;
    }
}