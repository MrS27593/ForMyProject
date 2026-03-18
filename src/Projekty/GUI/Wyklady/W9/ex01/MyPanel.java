package Projekty.GUI.Wyklady.W9.ex01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public
    class MyPanel
    extends JPanel
    implements Runnable, ColorListener {

    private JLabel header;
    private JButton startButton;

    public MyPanel(boolean version) {
        this.header = new JLabel("Generator");
        this.startButton = new JButton("Start");

        this.setBackground(Color.CYAN);

        if(version){
            this.setPreferredSize(new Dimension( 200, 200));
            this.setLayout(new BorderLayout());
            this.add( header, BorderLayout.PAGE_START);
            this.add( startButton, BorderLayout.PAGE_END);

            this.startButton.addActionListener(
                e -> {
                    this.startButton.setEnabled(false);
                    new Thread(this).start();
                }
            );
        }else {
            this.setPreferredSize(new Dimension(75, 75));
        }
    }

    @Override
    public void setBackground(Color bg) {
        if(listeners != null) {
            for (ColorListener listener : listeners)
                listener.onColorChanged(
                    new ColorChangedEvent( this, this.getBackground())
                );
        }
        super.setBackground(bg);
    }

    @Override
    public void run() {
        while (true){
            this.setBackground(
                new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
                )
            );

            try {
                Thread.sleep(1000 + (int)(Math.random()*3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private java.util.List<ColorListener> listeners = new ArrayList<>();

    public void addColorListener(ColorListener colorListener){
        listeners.add(colorListener);
    }

    @Override
    public void onColorChanged(ColorChangedEvent evt) {
        this.setBackground(
            evt.getColor()
        );
    }
}
