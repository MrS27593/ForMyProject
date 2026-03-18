package KlasowoObiektowo.Interfejsy.Function101Done;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyFunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> stringToLenght = s -> s.length();
        int len = stringToLenght.apply("czesc");
        System.out.println(len);
        Function<Integer, String> toString = a -> a.toString();
        Function<String, String> combined = stringToLenght.andThen(toString);
        System.out.println(combined.apply("jakis string"));

        Function<Integer,Integer> square = x->x*x;
        Function<String,Integer> parse = s->Integer.parseInt(s);
        Function<String, Integer> squareAfterParse = square.compose(parse);
        System.out.println(squareAfterParse.apply("5"));

        Function<String,String> identity = Function.identity();
        System.out.println(identity.apply("Hello"));

        List<String> list = List.of("a","bb","ccc");
        List<Integer> powtarzalnosci= list.stream().map(String::length).collect(Collectors.toList());
        for(int a : powtarzalnosci){
            System.out.print(a);
        }

        System.out.println();

        Function<Integer,Integer> twice = a->a*2;
        Function<Integer, Integer> plus2=a->a+2;
        Function<Integer,Integer> suma = twice.andThen(plus2);
        System.out.println(suma.apply(12));


    }
}
