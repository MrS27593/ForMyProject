package KlasowoObiektowo.Interfejsy.BiConsumer76Done;

import java.util.Map;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, Integer> print = (a,b)-> System.out.println(a+"->"+b);
        print.accept("to",3);

        Map<String, Integer> map = Map.of("a",1,"B",2);
        map.forEach((a,b)-> System.out.println(a+" "+b));

        BiConsumer<Integer, Integer> c1 = (a, b) -> System.out.println(a + b);
        BiConsumer<Integer, Integer> c2 = (a, b) -> System.out.println(a * b);

        BiConsumer<Integer, Integer> combined = c1.andThen(c2);
        combined.accept(2, 3);
    }
}
