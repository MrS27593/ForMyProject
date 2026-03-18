package Projekty.GUI.Wyklady.W4.ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public
    class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Jean", 1701);
        Student s2 = new Student("Jean", 1701);

        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(s1);
        studentHashSet.add(s2);

        System.out.println(studentHashSet.contains(s1));
        System.out.println(studentHashSet.contains(s2));

        System.out.println(studentHashSet.size());

        new LinkedList<Student>().addAll(studentHashSet);
    }
}
