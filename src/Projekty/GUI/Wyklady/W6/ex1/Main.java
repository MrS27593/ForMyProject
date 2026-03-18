package Projekty.GUI.Wyklady.W6.ex1;

public
    class Main {

    public static void main(String[] args) {
        //Wywołanie startu dla Runner i Thread
        new Runner().start();
        new Thread(new Runner2()).start();

        //Stworzenie zmiennych obiektowych
        Runner r1 = new Runner();
        Thread t1 = new Thread(
            new Runner2()
        );



        //Wywołanie metody start dla dwóch obiektów r1 i
        r1.start();
        t1.start();


        System.out.println("main end");
    }
}
