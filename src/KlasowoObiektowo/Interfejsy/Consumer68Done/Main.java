package KlasowoObiektowo.Interfejsy.Consumer68Done;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        printUpperCase.accept("hejka");

        System.out.println();

        List<String> names = List.of("Marcin", "Bartosz","Marta");
        Consumer<String> print = string -> System.out.println("Cześć "+string.toUpperCase());
        names.forEach(print);

        System.out.println();

        Consumer<String> first = string -> System.out.println("Pierwszy "+string);
        Consumer<String> second = string -> System.out.println("Drugi "+string);
        Consumer<String> result = first.andThen(second);
        result.accept("test");

        System.out.println();

        Consumer<String> saveToFile = content -> System.out.println("Zapisuję "+content);
        Consumer<String> printToCMD = content -> System.out.println("ok, wypisuje na cmd "+content);
        Consumer<String> result2 = saveToFile.andThen(printToCMD);
        result2.accept("tutaj jest zawartość pliku którą chcemy zapisać");
    }
}
