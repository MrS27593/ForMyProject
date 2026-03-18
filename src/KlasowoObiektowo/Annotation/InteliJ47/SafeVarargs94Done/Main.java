package KlasowoObiektowo.Annotation.InteliJ47.SafeVarargs94Done;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    @SafeVarargs
    public static <T> void print(T... items){
        for (T item:items){
            System.out.println(item);
        }
    }

    @SafeVarargs
    static <T> void broken(T...items){
        Object[] array = items;
        array[0] = 123;
    }

    @SafeVarargs
    public static <T> List<T> of(T...elements){
        List<T> list = new ArrayList<>();
        return list;
    }

}
