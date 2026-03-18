package Projekty.GUI.Cwiczenia.c4.Task04_02;

import java.awt.*;

public
    class MyColor
    extends Color
    implements Comparable<MyColor>{
    private int sumRGB;
    public MyColor(int r, int g, int b) {
        super(r, g, b);
        this.sumRGB = r + g + b;
    }

    public int getSumRGB() {
        return sumRGB;
    }

    @Override
    public String toString() {
        return "("+getRed()+","+getGreen()+","+getBlue()+")";
    }

    @Override
    public int compareTo(MyColor o) {
        return this.sumRGB - o.getSumRGB();
    }
}
