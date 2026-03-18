package Projekty.GUI.Wyklady.W5.ex2;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Wygenerowanie i wyświetlenie 10 losowych liczb z zakresu 0-1
        Stream.generate(Math::random)
            .limit(10)
            .forEach(System.out::println);

        System.out.println();

        //Wyświetlenie 10 liczb gdzie każda kolejna jest o 3 większa od poprzedniej
        Stream.iterate(1, e -> e + 3)
            .limit(10)
            .forEach(System.out::println);

        System.out.println();

        //Wyświetlenie 10 liczb gdzie pierwsza to 1 a każda kolejna jest o losową liczbą z zakresu 0-5
        Stream.iterate(1, e -> (int)(Math.random()*5))
            .limit(10)
            .forEach(System.out::println);

        System.out.println();


        //Wyświetlenie 10 parzystych liczb
        Stream.iterate(1, e -> e + 1)
                .filter(b -> b % 2 == 0)
//            .filter(
//                new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return myValidate(integer);
//                    }
//                }
//            )
//            .filter(Main::myValidate)
                .limit(10)
                .forEach(System.out::println);

        System.out.println();

        //Wyświetlenie strumienia ale z wyłączeniem kiedy e < 5 i tylko do momentu kiedy e < 10
        Stream.iterate(1, e -> e + 1)
            .takeWhile(e -> e < 10)
            .dropWhile(e -> e < 5)
            .forEach(System.out::println);

        System.out.println();

        //Wyświetlenie wszystkich elementów strumienia "MyItem([wartość])"
        Stream.iterate(1, e->e+1)
            .limit(10)
            .map( el -> new MyItem(el) )
            .forEach(System.out::println);

        System.out.println();

        //Stworzenie dwuwymiarowej tablicy "dataArray" i zainicjalizowanie zmiennymi
        String[][] dataArray = {
            { "a", "b"},
            { "c", "d"},
            { "e", "f"},
            { "g", "h"},
            { "i", "j"},
            { "k", "l"},
        };


        //Wyświetlenie strumienia dwuwymiarowej tablicy jako sturmien jednowymiarowej tablicy
        Arrays.stream(dataArray)
            .flatMap(x -> Arrays.stream(x))
            .forEach(System.out::println);

    }

    public static boolean myValidate(int val){
        return val % 2 == 0;
    }
}
