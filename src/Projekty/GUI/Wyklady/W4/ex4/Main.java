package Projekty.GUI.Wyklady.W4.ex4;

import java.util.Iterator;

public
    class Main {

    public static void main(String[] args) {

//        MyGenArray myObjectArray = new MyGenArray();

        //Stworzenie tablicy klasy MyGenArray zawierające Objekty
        MyGenArray<Object> myObjectArray = new MyGenArray<Object>();
        //Do obiektu o nazwie myObjectArray dodajemy nowego studenta o danych parametrach
        myObjectArray.add(new Student("Jean", 1701));

        //Wyświetlamy element na zerowym indexie obiektu myObjectArray
        System.out.println(myObjectArray.get(0));  //Output: Jean 1701

        //Zmienna klasy Student to teraz wartość z pozycji zerowej z obiektu myObjectArray zrzutowana na Studenta
        Student student1 = (Student) myObjectArray.get(0);

        //Stworzenie tablicy klasy MyGenArray zawierające Studentów
        MyGenArray<Student> studentMyGenArray = new MyGenArray<>();
        //Do tablicy "studentMyGenArray" dodajemy za pomocą metody add nowego studenta o danych parametrach
        studentMyGenArray.add(new Student("Jean", 1701));

        //Przypisanie do obiektu "student2" wartości na pozycji zerowej z tablicy studentMyGenArray
        Student student2 = studentMyGenArray.get(0);

        //Zmienna Klasy MyGenArray o szablonie String
        MyGenArray<String> stringMyGenArray;


        //Stworzenie iteratora "iter"o szablonie <Student> i przypisanie wartości takiej jak studentMyGenArray wywołujący metodę iterator
        Iterator<Student> iter = studentMyGenArray.iterator();
        //Dopóki iter ma dalszy element
        while(iter.hasNext())
            //wyświetl nasepny element
            System.out.println(iter.next()); //OUTPUT:Jean 1701

        //Stworzenie iteratora dla for eacha, aby wyświetlić element tablicy musimy później jeszcze przejśc for eachem
        iter = studentMyGenArray.iterator();
        for(Student s = iter.next(); iter.hasNext(); s = iter.next())
            System.out.println(s);

        //Przejście for eachem aby wyświetlić element tablicy
        for(Student s : studentMyGenArray)
            System.out.println(s); //OUTPUT:Jean 1701
    }
}
