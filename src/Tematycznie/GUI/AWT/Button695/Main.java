package Tematycznie.GUI.AWT.Button695;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        Button button1 = new Button("Kliknij w przycisk 1");
        button1.setBounds(20,20,40,40);

        Button button2 = new Button();
        button2.setLabel("Naciśnij tutaj Przycisk 2");
        button2.setBounds(60,60,45,78);

        Frame frame1 = new Frame("Ramka 1");
        frame1.setSize(300,300);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.add(button1);
        frame1.add(button2);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Przycisk 1 został naciśnięty");
            }
        });

        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Naciśnięto przycisk drugi");
                if(!button1.isEnabled()) {
                    button1.setEnabled(true);
                    System.out.println("Aktywowano przycisk 1");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Najechano na przycisk 2");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Zjechano z przycisku 2");
            }
        });



        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                frame1.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                super.windowIconified(e);
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                super.windowGainedFocus(e);
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
            }
        });

        System.out.println(button1.getLabel());

        System.out.println();

        button1.setEnabled(false);
        System.out.println("Właśnie wyłączono przycisk 1, jeśli chcesz go włączyć naciśnij przycisk 2");

        System.out.println();

        System.out.println("Za pomocą metody .isEnable() sprawdzamy czy przycisk 1 jest aktywny: "+button1.isEnabled());

        System.out.println();

        System.out.println("Za pomocą metody .isEnable() sprawdzamy czy przycisk 2 jest aktywny: "+button2.isEnabled());
    }
}
