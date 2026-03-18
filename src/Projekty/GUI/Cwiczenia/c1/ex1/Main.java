package Projekty.GUI.Cwiczenia.c1.ex1;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public
    class Main
    extends Frame {

    public static void main(String[] args) {
        new Main();
    }
    private Figure[] figures;
    private int figuresCount;
    public Main(){
        this.figures = new Figure[1000];
        this.figuresCount = 0;

        this.figures[figuresCount++] = new Rect(
            (int)(Math.random()*640),
            (int)(Math.random()*480),
            20 + (int)(Math.random()*80),
            20 + (int)(Math.random()*80)
        );

        this.figures[figuresCount++] = new Circle(
            (int)(Math.random()*640),
            (int)(Math.random()*480),
            20 + (int)(Math.random()*40)
        );

        for(int i=0; i< 10; i++)
            this.figures[figuresCount++] = getFigure();

        this.setSize( 640, 480);
        this.setVisible(true);

        this.addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );

        this.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    figures[figuresCount++] = getFigure();
                    repaint();
                }
            }
        );
    }

    private Figure getFigure(){
        return switch ((int)(Math.random()*2)){
            case 0 -> new Circle(
                (int)(Math.random()*640),
                (int)(Math.random()*480),
                20 + (int)(Math.random()*40)
            );
            default -> new Rect(
                (int)(Math.random()*640),
                (int)(Math.random()*480),
                20 + (int)(Math.random()*80),
                20 + (int)(Math.random()*80)
            );
        };
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.setColor(new Color(120, 200, 36));
        //g.fillRect( 100, 50, 50, 200);
//        rect.draw(g);
//        circle.draw(g);
        for(int i=0; i<figuresCount; i++)
            this.figures[i].draw(g);
    }
}