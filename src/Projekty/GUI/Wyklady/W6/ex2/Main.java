package Projekty.GUI.Wyklady.W6.ex2;

public
    class Main {

    public static void main(String[] args) {
        //Stworzenie dwóch zmiennych obiektowych o różnych konstruktorach jeden z + a drugi z -
        MyOperation p = new MyOperation('+');
        MyOperation s = new MyOperation('-');
        //Wywołanie dla tych dwóch obiektów metody start
        p.start();
        s.start();


        while(p.isAlive() && s.isAlive()){
        }

        //Wyświetlenie komunikatu i licznika
        System.out.println(
            "final output:\t"+MyOperation.counter //OUTPUT:final output:	0
        );
    }
}
