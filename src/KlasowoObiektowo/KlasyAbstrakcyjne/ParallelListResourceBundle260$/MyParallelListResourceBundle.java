package KlasowoObiektowo.KlasyAbstrakcyjne.ParallelListResourceBundle260$;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.*;

public class MyParallelListResourceBundle {
    public static void main(String[] args) {
        Locale locale = Locale.FRANCE;
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.example.i18n.Messages",locale);
        System.out.println(resourceBundle.getString("greeting"));
    }
}
