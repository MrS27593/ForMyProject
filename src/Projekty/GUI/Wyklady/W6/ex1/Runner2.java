package Projekty.GUI.Wyklady.W6.ex1;

//Publiczna klasa Runner która dziedziczy po Thread
public
    class Runner2
    implements Runnable{

    //Przysłonięcie metody "run" która wyświetla 100razy literę "a"
    @Override
    public void run() {
        for(int i=0; i<100; i++)
            System.out.print('b');
    }
}
