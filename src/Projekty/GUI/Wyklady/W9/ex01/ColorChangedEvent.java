package Projekty.GUI.Wyklady.W9.ex01;

import java.awt.*;
import java.util.EventObject;

public
    class ColorChangedEvent
    extends EventObject {

    private Color color;

    public ColorChangedEvent(Object source, Color color) {
        super(source);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
