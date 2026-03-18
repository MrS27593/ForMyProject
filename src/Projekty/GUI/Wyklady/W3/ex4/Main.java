package Projekty.GUI.Wyklady.W3.ex4;

import java.util.Arrays;

public
    class Main {

    public static void main(String[] args) {
        int[] tab = {20, 10, 40, 30};

        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        Student[] students = {
            new Student("Jean", 1701),
            new Student("Kathrin", 75463),
            new Student("Tiberius", 567)
        };

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new StudentCompare(StudentCompare.BY_NAME));
        System.out.println(Arrays.toString(students));

    }
}
