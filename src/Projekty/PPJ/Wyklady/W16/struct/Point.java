package Projekty.PPJ.Wyklady.W16.struct;
import java.awt.*;

public
    class Point {

    public static final String BLUE = "niebieski";
    public static final String RED = "czerwony";
    public static final String GREEN = "zielony";
    public static final String ORANGE = "pomaranczowy";

    protected int x, y;
    private String color;

    public Point(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(Graphics g){
        g.drawLine(
            this.x, this.y,
            this.x, this.y
        );
    }

    public void setColor(Graphics g){
        g.setColor(
            switch (color){
                case Point.GREEN -> new Color( 0, 255, 0);
                case Point.RED -> new Color(0xFF0000);
                case Point.ORANGE -> Color.ORANGE;
                default -> Color.BLACK;
            }
        );
    }

    public String toString(){
        return "Punkt( "+x+", "+y+")";
    }
}
