package Projekty.GUI.Cwiczenia.c4.Task04_01;

import java.util.Arrays;

public
    class Main {

    public static void main(String[] args) {
        Person[] people = {
            new Person( "Jan", 57),
            new Person( "Olga", 20),
            new Person( "Olga", 40),
            new Person( "Kaska", 18),
        };

        System.out.println(Arrays.toString(people));
        Person.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
