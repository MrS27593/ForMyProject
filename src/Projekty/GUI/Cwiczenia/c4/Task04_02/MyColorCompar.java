package Projekty.GUI.Cwiczenia.c4.Task04_02;

import java.util.Comparator;

public class MyColorCompar
    implements Comparator<MyColor> {
    ColComponent sortType;
    public MyColorCompar(ColComponent sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(MyColor o1, MyColor o2) {
        return switch(sortType){
            case RED -> o1.getRed() - o2.getRed();
            case GREEN -> o1.getGreen() - o2.getGreen();
            case BLUE -> o1.getBlue() - o2.getBlue();
            case NONE -> o1.getSumRGB() - o2.getSumRGB();
        };
    }
}
