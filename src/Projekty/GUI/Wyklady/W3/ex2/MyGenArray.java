package Projekty.GUI.Wyklady.W3.ex2;

//Publiczna klasa MyGenArray o szablonie <T>
public
    class MyGenArray <T> {
    //Prywatne pole tablicowe "tab" typu T
    private T[] tab;
    //Prywatne pole "count" typu int
    private int count;

    //Publiczny konstruktor który inicjalizuje wielkość tablicy na 10 i inicjalizuje pole count na 0
    public MyGenArray() {
        this.tab = (T[]) new Object[10];
        this.count = 0;
    }

    //Publiczna niezwracająca metoda "add" przyjmująca pewną wartośc typu T i dodająca ja do tablicy
    public void add(T val){
        //sprawdzenie czy jest jeszcze miejsce w tablicy, do momentu kiedy indeks jest <= długości tablicy jest jeszcze wolne miesjce
        if( this.count >= this.tab.length)
            //Jeżeli indeks wyjdzie poza wielkość tablicy to wyrzuć exception
            throw new ArrayStoreException();
        //Jeżeli warunek nie jest spełniony, tzn jest jeszcze miejsce w tablicy Przypisz wartość do tablicy na dany indeks po czy zwiększ indeks
        this.tab[this.count++] = val;
    }

    public T get(int index){
        //Zwrócenie wartości typu T na danym indeksie
        return this.tab[index];
    }
}
