package Projekty.GUI.Cwiczenia.c1.ex1;

import java.awt.*;

public
    class Rect
    extends Figure {
    private int sideA, sideB;

    public Rect(int x, int y, int sideA, int sideB) {
        super( x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void draw(Graphics g){
        g.fillRect( x, y, sideA, sideB);
    }
}
