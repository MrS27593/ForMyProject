package Projekty.GUI.Wyklady.W4.ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public
    class Main {

    public static void main(String[] args) {
        //Stworzenie obiektu "studentArrayList" klasy ArrayList o Szablonie <Student>
        ArrayList<Student> studentArrayList = new ArrayList<>();
        //Dodanie do "studentArrayList" nowych Studentów
        studentArrayList.add(new Student("Jean", 1701));
        studentArrayList.add(new Student("Penelopa", 543));
        studentArrayList.add(new Student("Joe", 1987));

        //Wyświetlenie całej zawartości studentArrayList za pomocą for each z dopiskiem al:
        for(Student s : studentArrayList)
            System.out.println("al: "+s);
        //OUTPUT:
        // al: Jean 1701
        //al: Penelopa 543
        //al: Joe 1987

        //Stworzenie obiektu "studentHashSet" klasy HashSet o Szablonie <Student>
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student("Jean", 1701));
        studentHashSet.add(new Student("Penelopa", 543));
        studentHashSet.add(new Student("Joe", 1987));

        //Wyświetlenie całej zawartości studentHashSet za pomocą for each z dopiskiem hs:
        for (Student s : studentHashSet)
            System.out.println("hs: "+s);
        //OUTPUT:
        //hs: Penelopa 543
        //hs: Joe 1987
        //hs: Jean 1701

        //Stworzenie 3 nowych Studentów
        Student s1 = new Student("Jean", 1701);
        Student s2 = new Student("Penelopa", 543);
        Student s3 = new Student("Joe", 1987);
        //Schemat połączenia klucza i wartości
        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        //Połączenie wartości klucza jako number do każdego obiektów
        studentHashMap.put(s1.getNumebr(), s1);
        studentHashMap.put(s2.getNumebr(), s2);
        studentHashMap.put(s3.getNumebr(), s3);

        //Wyświetlenie całej zawartości "studentHashMap" za pomocą for each z dopiskiem hm:
        for(Integer i : studentHashMap.keySet())
            System.out.println("hm: "+studentHashMap.get(i));

    }
}
