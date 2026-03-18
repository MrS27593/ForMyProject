package Projekty.GUI.Wyklady.W3.ex1;

//Publiczna klasa MyStudentArray
public
class MyStudentArray {

    //Prywatne pole tablicowe typu Student "tab"
    private Student[] tab;
    //Prywatne pole typu int "count"
    private int count;

    //Publiczny konstruktor, który inicjalizuje tablicę o wielkości 10 i ustawia count na wartość 0
    public MyStudentArray() {
        this.tab = new Student[10];
        this.count = 0;
    }

    //Publiczna niezwracająca metoda "add" przyjmująca pewną wartośc typu Student i dodająca ja do tablicy
    public void add(Student val){
        //sprawdzenie czy jest jeszcze miejsce w tablicy, do momentu kiedy indeks jest <= długości tablicy
        if( this.count >= this.tab.length)
            //Jeżeli indeks wyjdzie poza wielkośc tablicy to wyrzuć exception
            throw new ArrayStoreException();
        //Jeżeli warunek nie jest spełniony, tzn jest jeszcze miejsce w tablicy Przypisz wartość do tablicy na dany indeks po czy zwiększ indeks
        this.tab[this.count++] = val;
    }

    //Publiczna metoda "get" zwracająca wartość typu Student spod danego ineksu
    public Student get(int index){
        //Zwrócenie wartości typu Student na danym indeksie
        return this.tab[index];
    }
}
