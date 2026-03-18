package KlasowoObiektowo.Interfejsy.BiFunction74Done;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sum = (a,b) -> a+b;
        System.out.println(sum.apply(4,8));

        BiFunction<String, Integer, String> repeat = (q,w)-> q.repeat(w);
        System.out.println(repeat.apply("Powtorz",3));

        BiFunction<Integer, Integer,Integer> sum2 = (a,b)->a+b;
        Function<Integer,String> tostring = (a) -> a.toString();
        BiFunction<Integer,Integer,String> sumAsString = sum2.andThen(tostring);

        System.out.println(sumAsString.apply(5,7));
        BinaryOperator<Integer> add = (q,w) ->q+w;

//        BiFunction<Integer, Integer,Integer> x = map.compute(key, (k, v) -> v == null ? 1 : v + 1);
    }
}
