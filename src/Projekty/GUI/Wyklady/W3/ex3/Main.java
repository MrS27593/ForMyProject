package Projekty.GUI.Wyklady.W3.ex3;

import java.util.Arrays;

//Publiczna klasa Main
public
    class Main {

    //PVSM
    public static void main(String[] args) {
        //Inicjalizowanie tablicy "tab" wartościami 20,10,40,30
        int[] tab = {20, 10, 40, 30};

        //wyświetlenie tablicy za pomocą metody toString z klasy Arrays
        System.out.println(Arrays.toString(tab)); //OUTPUT: [20, 10, 40, 30]
        //Wywołanie metody sort z klasy Arrays dla argumentu tab - metoda segreguje naszą tablicę tab
        Arrays.sort(tab);
        //Wyświetlenie posotowanej już tablicy
        System.out.println(Arrays.toString(tab)); //OUTPUT: [10, 20, 30, 40]

        //inicjalizowanie tablicy "students" odpowiednimi wartościami
        Student[] students = {
            new Student("Jean", 1701),
            new Student("Kathrin", 75463),
            new Student("Tiberius", 567)
        };

        //wyświetlenie tablicy "students" za pomocą metody toString z klasy Arrays
        System.out.println(Arrays.toString(students)); //OUTPUT:[Jean 1701, Kathrin 75463, Tiberius 567]
        //Wywołanie metody sort z klasy Arrays dla argumentu students - metoda segreguje naszą tablicę students
        Arrays.sort(students);
        //Wyświetlenie posotowanej już tablicy "students"
        System.out.println(Arrays.toString(students)); //OUTPUT:[Tiberius 567, Jean 1701, Kathrin 75463]


    }
}
