package Projekty.GUI.Wyklady.W3.ex1;

//Publiczna klasa MyArray
public
    class MyArray {

    //Prywatne pole tablicowe typu int "tab"
    private int[] tab;
    //Prywatne pole typu int "count"
    private int count;

    //Publiczny konstruktor, który inicjalizuje tablicę o wielkości 10 i ustawia count na wartość 0
    public MyArray() {
        this.tab = new int[10];
        this.count = 0;
    }

    //Publiczna niezwracająca metoda add przyjmująca pewną wartośc i dodająca ja do tablicy
    public void add(int val){
        //sprawdzenie czy jest jeszcze miejsce w tablicy, do momentu kiedy indeks jest <= długości tablicy
        if( this.count >= this.tab.length)
            //Jeżeli indeks wyjdzie poza wielkośc tablicy to zwróć exception
            throw new ArrayStoreException();
        //Przypisz wartość do tablicy na dany indeks po czy zwiększ indeks
        this.tab[this.count++] = val;
    }

    //Publiczna metoda "get" zwracająca wartośc spod danego ineksu
    public int get(int index){
        //Zwrócenie wartości na danym indeksie
        return this.tab[index];
    }
}
