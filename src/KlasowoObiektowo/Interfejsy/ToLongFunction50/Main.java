package KlasowoObiektowo.Interfejsy.ToLongFunction50;

import java.util.List;
import java.util.function.ToLongFunction;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("dom","podwórko","pałac");

        long sumOfletters = words.stream().mapToLong((ToLongFunction<String>) String::length).sum();
        System.out.println(sumOfletters);

        ToLongFunction<String> result = s->s.charAt(10);
        System.out.println("To jest string i chcemy dowiedzieć się jaki jest char na pozycji 10");
        System.out.println( result.applyAsLong("To jest string i chcemy dowiedzieć się " +
                "jaki jest char na pozycji 10"));
        System.out.println((char) result.applyAsLong("To jest string i chcemy dowiedzieć się " +
                "jaki jest char na pozycji 10"));
    }
}
