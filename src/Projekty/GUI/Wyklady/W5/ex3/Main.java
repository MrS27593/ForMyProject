package Projekty.GUI.Wyklady.W5.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //PSVM
    public static void main(String[] args) {
        String[][] dataArray = {
                { "a", "b"},
                { "c", "d"},
                { "e", "f"},
                { "g", "h"},
                { "i", "j"},
                { "k", "l"},
        };

        //Stworzenie zmiennej "characterList" która zmienia tablicę "dataArray" na strumień
        List<String> characterList = Arrays.stream(dataArray)
            //Przerobienie dwuwymiarowej tablicy na jednowymiarową za pomocą metody "flatMap"
            .flatMap(x -> Arrays.stream(x))
                //Wywołanie metody collectde
                .collect(Collectors.toList());
        System.out.println(characterList); //OPUTPUT:[a, b, c, d, e, f, g, h, i, j, k, l]

        //Stworzenie
        List<MyStringItem> myStringItemList = Arrays.stream(dataArray)
            .flatMap(x -> Arrays.stream(x))
            .collect(MyCollectorTask.collector());
        System.out.println(myStringItemList);

    }
}


/*

    public static <T>
    Collector<T, ?, List<T>> toList() {
        return new CollectorImpl<>(ArrayList::new, List::add,
                                   (left, right) -> { left.addAll(right); return left; },
                                   CH_ID);
    }

Returns a Collector that accumulates the input elements into an unmodifiable List in encounter order. The returned Collector disallows null values and will throw NullPointerException if it is presented with a null value.
Returns:
a Collector that accumulates the input elements into an unmodifiable List in encounter order
Since:
10


 */
