package KlasowoObiektowo.Interfejsy.Function101Done.Obiektowe;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> stringLenght = (string) -> string.length();

        int lenght = stringLenght.apply("tutaj jestjakiś String");
        System.out.println("Wyświetlamy wynik długości stringa używając .apply() na Fukcji stringLenght: "
                +lenght);

        System.out.println();

        Function<String, String> toSmallLetters = string -> string.toLowerCase();
        String stringInSmall = toSmallLetters.apply("TOJESTORYGINALNY TEKST");
        System.out.println("Wyświetlamy zwracany string przez wywołanie .apply() przez Fukcje to SmallLetters: "+
                stringInSmall);

        System.out.println();

        Function<Integer, Integer> Add = x -> x+9;
        Function<Integer,Integer> Multiply = x -> x*9;
        Function<Integer, Integer> result = Add.andThen(Multiply);
        System.out.println("Wyświetlamy wynik najpierw z dodawania a potem mnożenia: "+result.apply(7));

        System.out.println();

        Function<Integer,Integer> result2 = Add.compose(Multiply);
        System.out.println("Wyświetlamy wynik najpierw z mnożenia a potem dodawania: "+result2.apply(7));

        System.out.println();

        List<String> words = List.of("banan","jabłko","gruszka");
        List<Integer> listOfWordsLenght = words.stream().map(stringLenght).toList();
        System.out.println(listOfWordsLenght);

        System.out.println();

        Function<Double,Double> square = new Function<>() {
            @Override
            public Double apply(Double x) {
                return x*x;
            }
        };

        System.out.println("Oto wywołanie .apply() za pomocą nadpisanego apply: "+square.apply(9.09));
    }
}
