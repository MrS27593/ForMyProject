package KlasowoObiektowo.KlasyZwykle.Canvas271;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyCanvas extends Canvas {

    public MyCanvas(){
        setSize(100,500);
        setBackground(Color.BLACK);
    }
    public void paint(Graphics graphics){
        graphics.setColor(Color.CYAN);
        graphics.drawRect( 100,100,100,100);
    }
    public static void main(String[] args) {
        MyCanvas myCanvas = new MyCanvas();
        Frame frame = new Frame("Ranka");
        frame.add(myCanvas);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
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

    }
}
