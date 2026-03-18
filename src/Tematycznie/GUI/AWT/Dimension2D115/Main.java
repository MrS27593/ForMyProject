package Tematycznie.GUI.AWT.Dimension2D115;

import java.awt.geom.Dimension2D;

public class Main {
    public static void main(String[] args) {
        Dimension2D dimension2D = new Dimension2D() {

            private double width = 200.00;
            private double height = 100.00;
            @Override
            public double getWidth() {
                return width;
            }

            @Override
            public double getHeight() {
                return height;
            }

            @Override
            public void setSize(double width, double height) {
                this.width=width;
                this.height=height;
            }
        };
    }
}

class MyDimension extends Dimension2D{

    private double width;
    private double height;
    @Override
    public double getWidth() {
        return 0;
    }

    public MyDimension(double width, double height){
        this.width=width;
        this.height=height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setSize(double width, double height) {
        this.width=width;
        this.height=height;
    }

    public static void main(String[] args) {
        MyDimension myDimension = new MyDimension(150.5,200.25);
        System.out.println("Width: "+myDimension.width);
        System.out.println("Height: "+myDimension.getHeight());
    }

}
