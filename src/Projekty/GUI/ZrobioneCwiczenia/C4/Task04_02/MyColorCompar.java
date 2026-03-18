package FinalneMarcinaIMoje.Task04_02;

import java.util.Comparator;

public class MyColorCompar implements Comparator<MyColor> {

    private ColComponent colorComponent;

    public MyColorCompar(ColComponent colorComponent) {
        this.colorComponent = colorComponent;
    }

    @Override
    public int compare(MyColor color1, MyColor color2) {
        return switch (colorComponent) {
            case RED -> compareByRED(color1, color2);
            case GREEN -> compareByGREEN(color1, color2);
            case BLUE -> compareByBLUE(color1, color2);
            case NONE -> color1.compareTo(color2);
        };
    }

    public int compareByRED(MyColor color1, MyColor color2) {
        if (color1.getRed() == color2.getRed())
            return 0;
        return color1.getRed() > color2.getRed() ? 1 : -1;
    }

    public int compareByGREEN(MyColor color1, MyColor color2) {
        if (color1.getGreen() == color2.getGreen())
            return 0;
        return color1.getGreen() > color2.getGreen() ? 1 : -1;
    }

    public int compareByBLUE(MyColor color1, MyColor color2) {
        if (color1.getBlue() == color2.getBlue())
            return 0;
        return color1.getBlue() > color2.getBlue() ? 1 : -1;
    }


}
