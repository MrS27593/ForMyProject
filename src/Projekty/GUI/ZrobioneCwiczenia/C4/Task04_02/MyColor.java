package FinalneMarcinaIMoje.Task04_02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyColor extends java.awt.Color implements Comparable<MyColor>{

    private int r;

    private int g;
    private int b;
    private int sumOfColor;



    public MyColor(int r, int g, int b) {
        super(r,g,b);
        this.r=r;
        this.g=g;
        this.b=b;
        this.sumOfColor=r+g+b;
    }

    @Override
    public String toString(){
        return getRed()+" "+getGreen()+" "+getBlue();
    }

    @Override
    public int compareTo( MyColor colorToCompare ){
        if( colorToCompare.sumOfColor == this.sumOfColor )
            return 0;
        else if (colorToCompare.sumOfColor > this.sumOfColor)
            return  -1;
        return 1;

    } //możliwośc ternarnego


}
