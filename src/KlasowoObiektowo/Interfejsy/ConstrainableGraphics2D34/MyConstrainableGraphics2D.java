//package Interfejsy.ConstrainableGraphics2D34;
//import com.jetbrains.desktop.ConstrainableGraphics2D;
//import java.awt.*;
//import java.awt.geom.Rectangle2D;
//import com.jetbrains.desktop.ConstrainableGraphics2D;
//import com.jetbrains.desktop.GraphicsUtils;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.geom.Rectangle2D;
//public class MyConstrainableGraphics2D implements ConstrainableGraphics2D {
//    public static void main(String[] args) {
//
//    }
//    private Rectangle2D constraint;
//    /**
//     * @param region
//     */
//    @Override
//    public void constrain(Rectangle2D region) {
//        this.constraint = region;
//    }
//    /**
//     * @return
//     */
//    @Override
//    public Object getDestination() {
//        return this;
//    }
//    /**
//     * Constrain this graphics object to have a permanent device space
//     * origin of (x, y) and a permanent maximum clip of (x,y,w,h).
//     * Calling this method is roughly equivalent to:
//     * g.translate(x, y);
//     * g.clipRect(0, 0, w, h);
//     * except that the clip can never be extended outside of these
//     * bounds, even with setClip() and for the fact that the (x,y)
//     * become a new device space coordinate origin.
//     * <p>
//     * These methods are recursive so that you can further restrict
//     * the object by calling the constrain() method more times, but
//     * you can never enlarge its restricted maximum clip.
//     *
//     * @param x
//     * @param y
//     * @param w
//     * @param h
//     */
//    @Override
//    public void constrain(int x, int y, int w, int h) {
//
//    }
//}
//
//class ConstrainedGraphicsExample extends JPanel {
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Rzutowanie na Graphics2D (potrzebne do pracy z ConstrainableGraphics2D)
//        Graphics2D g2d = (Graphics2D) g;
//
//        // Tworzymy instancję naszej klasy implementującej ConstrainableGraphics2D
//        MyConstrainableGraphics2D myCgImpl = new MyConstrainableGraphics2D();
//
//        // Tworzymy obiekt ConstrainableGraphics2D oparty na istniejącym Graphics2D
//        ConstrainableGraphics2D cg2d = GraphicsUtils.createConstrainableGraphics(g2d, myCgImpl);
//
//        // Ustawiamy ograniczenie do obszaru 100x100
//        cg2d.constrain(new Rectangle2D.Double(0, 0, 100, 100));
//
//        // Przykład rysowania w ograniczonym obszarze
//        cg2d.drawLine(0, 0, 100, 100);
//        cg2d.fillRect(10, 10, 30, 30);
//
//        // Możesz teraz wyczyścić ograniczenia, jeśli chcesz narysować coś globalnie
//        // cg2d.clearConstraints();
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("ConstrainableGraphics2D Demo");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//        frame.setContentPane(new ConstrainedGraphicsExample());
//        frame.setVisible(true);
//    }
//}