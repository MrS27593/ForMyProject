package KlasowoObiektowo.Interfejsy.UnaryOperator53;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperatorTwice = (t) -> t*2;
        System.out.println(unaryOperatorTwice.apply(100));

        UnaryOperator<String> toUpper = String::toUpperCase;
        System.out.println(toUpper.apply("hello"));

        List<Integer> list =List.of(1,2,3);
        list.replaceAll((x)->x*2);

    }
}
