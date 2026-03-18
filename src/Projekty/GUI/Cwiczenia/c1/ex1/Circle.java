package Projekty.GUI.Cwiczenia.c1.ex1;

import java.awt.*;

public
    class Circle
    extends Figure {
    private int radius;

    public Circle(int x, int y, int radius) {
        super( x, y);
        this.radius = radius;
    }

    public void draw(Graphics g){
        g.fillOval( x, y, 2*radius, 2*radius);
    }
}
