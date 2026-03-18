package KlasowoObiektowo.Interfejsy.Function101Done.Klasowe;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> indentityFunction = Function.identity();
        System.out.println(indentityFunction.apply("test"));
    }
}
