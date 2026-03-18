package KlasowoObiektowo.Interfejsy.Supplier50Done;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Supplier<String> result1 = () -> "Witaj świecie";
        System.out.println(result1.get());

        System.out.println();

        Supplier<Double> result2 = Math::random;
        System.out.println(result2.get());

        System.out.println();

        Stream.generate(result2).limit(5).forEach(System.out::println);



    }
}


