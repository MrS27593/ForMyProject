package Projekty.PPJ.Wyklady.W16;
import Projekty.PPJ.Wyklady.W16.dataStruct.MyList;
import Projekty.PPJ.Wyklady.W16.struct.Square;
import Projekty.PPJ.Wyklady.W16.struct.Point;
import Projekty.PPJ.Wyklady.W16.struct.Circle;

import java.awt.*;

public
class Main
        extends Frame {

    private MyList list;

    public static void main(String[] args) {
        /*Point p = new Square( 100, 500, Point.GREEN);
        System.out.println(p);

        MyList list = new MyList();
        list.add( new Circle( 200, 100, Point.BLUE));
        list.add( new Circle( 220, 120, Point.BLUE));
        list.add( new Circle( 230, 140, Point.BLUE));

        for(int i=0; i < list.getSize(); i++)
            System.out.println(list.viewData(i));
        */

        new Main();
    }

    public Main(){
        this.list = new MyList();

        for(int i=0; i<100; i++)
            this.list.add(
                    Math.random() > 0.5
                            ?
                            new Square(
                                    (int) (Math.random()*640),
                                    (int) (Math.random()*480),
                                    Point.GREEN
                            )
                            :
                            new Circle(
                                    (int) (Math.random()*640),
                                    (int) (Math.random()*480),
                                    Point.ORANGE
                            )
            );

        this.setSize( 640, 480);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int i=0; i < this.list.getSize(); i++)
            this.list.viewData(i).draw(g);
    }
}
