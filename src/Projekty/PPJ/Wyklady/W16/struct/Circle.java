package Projekty.PPJ.Wyklady.W16.struct;
import java.awt.*;


public
    class Circle
    extends Point {

    public Circle(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public void draw(Graphics g) {
        setColor(g);
        g.fillOval(
            this.x-5, this.y-5,
            10, 10
        );
        super.draw(g);
    }

    @Override
    public String toString() {
        return "Kolo( "+super.toString()+")";
    }
}
