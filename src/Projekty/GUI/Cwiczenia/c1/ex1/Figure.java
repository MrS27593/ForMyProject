package Projekty.GUI.Cwiczenia.c1.ex1;

import java.awt.*;

public
    abstract class Figure {
    protected int x, y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}
