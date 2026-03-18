package Projekty.GUI.Wyklady.W4.ex4;

import java.util.Iterator;

//Publiczna klasa "MyGenArray" typu szablonowego która implementuje interfejs Iterable typu szablonowego
public
    class MyGenArray <T>
    implements Iterable<T> {
    //prywatna tablica "tab" typu szablonowego
    private T[] tab;
    //prywatne pole "count" typu int
    private int count;

    //Konstruktor który ustala wielkośc tablicy na 10 i przypisuje polu count wartość 0
    public MyGenArray() {
        this.tab = (T[]) new Object[10];
        this.count = 0;
    }

    //Publiczna metoda "add" która jako argument przyjmuje wartośc typu szablonowego i dodaje podaną wartośc na kolejny indeks tablicy po czy zwiększa count
    public void add(T val){
        if( this.count >= this.tab.length)
            throw new ArrayStoreException();
        this.tab[this.count++] = val;
    }

    //publiczna metoda "get" która zwraca wartość typu szablonowego, wartośc która znajduje się pod danym indeksem
    public T get(int index){
        return this.tab[index];
    }

    //Przysłonięcie metody "iterator" która zwraca zmienna klasy Iterator typu T
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                return tab[index++];
            }
        };
    }
}
