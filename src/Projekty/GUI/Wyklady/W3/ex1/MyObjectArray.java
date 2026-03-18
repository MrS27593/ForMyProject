package Projekty.GUI.Wyklady.W3.ex1;

//Publiczna klasa MyObjectArray
public class MyObjectArray {
    //Prywatne pole tablicowe typu Object "tab"
    private Object[] tab;
    //Prywatne pole typu int "count"
    private int count;

    //Publiczny konstruktor, który inicjalizuje tablicę przechowującą Objekty o wielkości 10 i ustawia count na wartość 0
    public MyObjectArray() {
        this.tab = new Object[10];
        this.count = 0;
    }

    //Publiczna niezwracająca metoda "add" przyjmująca pewną wartośc i dodająca ja do tablicy
    public void add(Object val){
        //sprawdzenie czy jest jeszcze miejsce w tablicy, do momentu kiedy indeks jest <= długości tablicy
        if( this.count >= this.tab.length)
            //Jeżeli indeks wyjdzie poza wielkośc tablicy to zwróć exception
            throw new ArrayStoreException();
        //Jeżeli warunek nie jest spełniony, tzn jest jeszcze miejsce w tablicy Przypisz wartość do tablicy na dany indeks po czy zwiększ indeks
        this.tab[this.count++] = val;
    }

    //Publiczna metoda "get" zwracająca wartość typu Object spod danego ineksu
    public Object get(int index){
        //Zwrócenie wartości na danym indeksie
        return this.tab[index];
    }
}
