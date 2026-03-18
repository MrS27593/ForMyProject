package Projekty.GUI.Wyklady.W1.ex3;

//Odpowiednie importy klas: grafiki, nasłuchiwania okien
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//publiczna klasa rozszerzająca po Frame
public
    class MyFrame
    extends Frame {

    public static void main(String[] args) {
        //Wywołanie obiektu/konstruktora Klasy MyFrame
        new MyFrame();
    }

    //Publiczny konstruktor wywołujący metodę setSize ustawiającą wielkość okna i setVisible z argumentem True co sprawia, że okno jest widoczne
    public MyFrame(){
        //Obiekt od razu ustawia rozmiar okna
        this.setSize(640, 480);

        //obiekt ustawia widocznośc okna
        this.setVisible(true);

        //Obiekt implementuje nasłuchiwanie klieknięcia, korzystając z metody windowClosing okno się zamyka
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
