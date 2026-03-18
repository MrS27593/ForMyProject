package Tematycznie.GUI.AWT.Frame1347;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main {
    public static void main(String[] args) {
        int w = Toolkit.getDefaultToolkit().getScreenSize().width;
        System.out.println(w);
        int h = Toolkit.getDefaultToolkit().getScreenSize().height;
        System.out.println(h);
        Frame frame = new Frame();
        Frame frame1 = new Frame("Ramka");

        frame1.setSize(w,h);
        System.out.println("Ustawiono rozmiar ramki za pomocą metody .setSize(int width, int height)");
        frame1.setLocation(0,0);
        System.out.println("Ustawiono lokalizację okna za pomocą metody .setLocation()");
        frame1.setBackground(Color.BLUE);
        System.out.println("Ustawiono kolor tła na niebieski za pomocą .setBackground(Color color)");
        frame1.setLayout(new GridLayout());
        System.out.println("Ustawiono ułożenie elementów ramki za pomocą metody .setLayout(LayoutManager layoutmanager)");
        System.out.println("Takie ułożenie sprawia że mimo iż ustaliliśmy wielkość przycisku to będzie on na całej ramce");

        Button button = new Button("To jest przycisk");
//        button.setBounds(10,60,100,200);
        button.setSize(400,400);
        button.setVisible(true);
        frame1.add(button);

        button.addActionListener(a-> System.out.println("Kliknięto przycisk"));

        frame1.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }
        });

        frame1.setVisible(true);
        System.out.println("Ustawiono widoczność ramki na true");

        frame1.setTitle("nowy tytuł");
        System.out.println("Ustawienie tytułu okna za pomocą .setTitle(String title)");

        Dimension dimension = frame1.getSize();
        int width = dimension.width;
        int width2 = frame1.getSize().width;
        int height = dimension.height;
        int height2 = frame1.getSize().height;
        System.out.println("Wyświetlamy rozmiar okna za pomocą .getSize()"+dimension);
        System.out.println("Wyświetlamy rozmiar okna za pomocą .getSize()"+width+" "+height);

        frame1.setResizable(true);
        System.out.println("Ustalamy że nie można ręcznie zmieniać rozmiaru okna za pomocą .setResizable(false)");
        System.out.println(".isVisible() -> zwraca booleana czy okno jest widoczne "+frame1.isVisible());
        frame1.setForeground(Color.CYAN);
        System.out.println(".setForeground(Color color)-> ustawia kolor Frontu");


    }
}
