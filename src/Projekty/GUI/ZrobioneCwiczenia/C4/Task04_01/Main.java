package FinalneMarcinaIMoje.Task04_01;


import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Person[] personArray = {
                new Person("Michael ",23),
                new Person("Monika ",18),
                new Person("Bogumił ",38),
                new Person("Marcin ",27),
                new Person("Bartosz ",20),
                new Person("Magdalena ",31),
                new Person("Mariusz ",65),
                new Person("Matylda ",12),
        };

        System.out.println(Arrays.toString(personArray));

        System.out.println("");

        Person.sort(personArray);

        System.out.println("");

        //System.out.println(Arrays.toString(personArray)); lub pętla

        System.out.print("[");
        for (Person person : personArray) {
            System.out.print(person+", ");
        }
        System.out.println("]");

    }
}