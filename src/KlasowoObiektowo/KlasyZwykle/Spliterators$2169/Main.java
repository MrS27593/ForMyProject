package KlasowoObiektowo.KlasyZwykle.Spliterators$2169;

import java.util.Spliterator;
import java.util.Spliterators;

public class Main {
    public static void main(String[] args) {
        int[] array =  {1,2,3,4};
        Spliterator.OfInt spliterator = Spliterators.spliterator(array,Spliterator.ORDERED);

        System.out.println(spliterator.toString());

        Spliterator<String> empty = Spliterators.emptySpliterator();
    }
}
