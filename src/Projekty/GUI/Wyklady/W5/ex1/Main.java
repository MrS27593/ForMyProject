package Projekty.GUI.Wyklady.W5.ex1;

import java.util.stream.Stream;

public
    class Main {

    //PSVM
    public static void main(String[] args) {
        //Wyświetlenie za pomocą metody "forEach" wsyzstkich elementów Strumienia
        Stream.of( "a1", "a2", "b3", "b4", "c5")
            .forEach(System.out::println);

        //Wygenerowanie i wyświetlenie 10 losowych liczb z zakresu 0-1
        Stream.generate(Math::random)
            .limit(10)
            .forEach(System.out::println);

        //Wyświetlenie 10 licz gdzie każda kolejna jest o 3 większa od poprzedniej
        Stream.iterate(1, e -> e + 3)
            .limit(10)
            .forEach(System.out::println);
    }
}
