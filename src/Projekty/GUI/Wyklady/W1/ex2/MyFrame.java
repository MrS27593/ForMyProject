package Projekty.GUI.Wyklady.W1.ex2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Publiczna klasa MyFrame dziedzicząca po Frame
public
    class MyFrame
    extends Frame {

    //Od razu w PSVM wywołujemy obiekt MyFrame
    public static void main(String[] args) {
        new MyFrame();
    }

    //Konstruktor wywołuje okienko o danym rozmiarze i ustawia jego widocznośc oraz sprawia, że obiekt jest zamykalny nasłuchuje kliknięcie w exit
    public MyFrame(){
        //Ustawienie rozmiarów okna za pomocą setSize
        this.setSize(640, 480);

        //Ustawienie widoczności na true
        this.setVisible(true);

        //Obiekt wywołuje metodę nasłuchiwania "addWindowListener" , która od razu tworzy obiekt klasy WindowAdapter i w klasie anonimowej wywołuje metodę "windowClosing"
        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
    }
}
