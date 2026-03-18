package KlasowoObiektowo.Interfejsy.BiFunction74Done.Obiektowe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierszą zmienną x: ");
        double x = scanner.nextDouble();
        System.out.println("Zmienne a i b będą podawane w metodzie Interfejsu BiFunction");
        System.out.println("Podaj drugą zmienną c: ");
        double c = scanner.nextDouble();

        BiFunction<Double,Double,Double> y = (a,b) -> (Math.pow(a,2)) + b * x + c;
        double result = y.apply(4.0,7.0);
        System.out.println("Wynik fukcji kwadartowej to: "+result);

        System.out.println();

        BiFunction<String, String, Integer> countSumOfLetters = (a,b) -> a.length()+b.length();
        System.out.println("Łączna długość wszystkich 2 słów to: "+
                countSumOfLetters.apply("to jest pierwszy string",
                "domek"));

        System.out.println();

        BiFunction<Integer,Integer,Integer> multiply = (a,b) -> a*b;
        Function<Integer,Double> poweer = a -> Math.pow(a,2);
        BiFunction<Integer, Integer, Double> result2 = multiply.andThen(poweer);
        System.out.println("Oto wynik operacji najpier pomnożenia dwóch argumentów a nastęnie" +
                "podniesienia do potęgi 2 "+result2.apply(8,9));

        System.out.println();

        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("a",1);
        mapa.merge("a",4,(old, newone) -> old+newone);
        mapa.merge("b",7,(old, newone) -> old+newone);
        System.out.println(mapa);
//        Function<>
    }
}
