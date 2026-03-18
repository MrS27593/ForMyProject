package Projekty.GUI.Wyklady.W4.ex2;

//Publiczny enum "Card"
public
    enum Card {

    //Opisanie 3 przypadków kart. Każda karta opisywana jest przez wartość i opis
    TWO(2, "dwa"), JACK(11, "walet"), KING(14, "krol");

    //Pole "value" typu int
    int value;
    //Pole "str" typu String
    String str;


    //pakietowy konstruktor enumów przypisuje argumenty do pól
    Card(int value, String str) {
        this.value = value;
        this.str = str;
    }

    //publiczna metoda "getValue" zwracająca wartość
    public int getValue() {
        return value;
    }

    //Publiczna niezwracająca metoda "setValue", która ustala wartość.
    public void setValue(int value) {
        this.value = value;
    }
}
