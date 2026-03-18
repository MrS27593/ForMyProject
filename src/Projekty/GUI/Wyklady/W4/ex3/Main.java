package Projekty.GUI.Wyklady.W4.ex3;

import java.util.Arrays;

//Publiczna Klasa Main
public
    class Main {

    //PSVM
    public static void main(String[] args) {
        //Zainicjalizowanie tablicy
        int[] tab = {20, 10, 40, 30};

        //Wyświetlenie tablicy metodą toString z klasy Arrays OUTPUT:[20, 10, 40, 30]
        System.out.println(Arrays.toString(tab));
        //Posortowanie tablicy
        Arrays.sort(tab);
        //Wyświetlenie tablicy metodą toString z klasy Arrays OUTPUT:[10, 20, 30, 40]
        System.out.println(Arrays.toString(tab));

        //Stworzenie tablicy "students" i przypisanie jej od razu nowych obiektów klasy Students
        Student[] students = {
            new Student("Jean", 1701),
            new Student("Kathrin", 75463),
            new Student("Tiberius", 567)
        };

        //Wyświetlenie tablicy metodą toString z klasy Arrays OUTPUT:[Jean 1701, Kathrin 75463, Tiberius 567]
        System.out.println(Arrays.toString(students));
        //Posortowanie tablicy
        Arrays.sort(students);
        //Wyświetlenie tablicy metodą toString z klasy Arrays OUTPUT:[Tiberius 567, Jean 1701, Kathrin 75463]
        System.out.println(Arrays.toString(students));

        //Wyświetlenie tablicy metodą toString z klasy Arrays OUTPUT:[Tiberius 567, Jean 1701, Kathrin 75463]
        System.out.println(Arrays.toString(students));
        //Teraz proces sortowania odbywa się w określony przez naz sposób
        Arrays.sort(students, new StudentCompare(StudentCompare.SortType.BY_NAME));
        //Wyświetlenie tablicy posegregowanej po Imionach
        System.out.println(Arrays.toString(students));

    }
}
