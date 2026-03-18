package Projekty.GUI.Wyklady.W3.ex2;


public
    class Main {

    public static void main(String[] args) {

        //Stworzenie obiektu "myObjectArray1" typu MyGenArray
        MyGenArray myObjectArray1 = new MyGenArray();
        //Stworzenie obiektu "myObjectArray" typu MyGenArray
        MyGenArray<Object> myObjectArray = new MyGenArray<Object>();
        //obiekt myObjectArray wywołuje metodę add o podanych argumentach
        myObjectArray.add(new Student("Jean", 1701));

        //Wyświetlenie wartości obiektu "myObjectArray" na pozycji 0
        System.out.println(myObjectArray.get(0)); //OUTPUT: Jean 1701

        //Stworzenie obiektu "student1" typu Student i przypisanie mu wartości takiej jak wartość obiektu myObjectArray na pozycji 0 zrzutowanej na Studenta
        Student student1 = (Student) myObjectArray.get(0);

        ////Stworzenie obiektu "studentMyGenArray" typu MyGenArray ale o szablonie <Student>
        MyGenArray<Student> studentMyGenArray = new MyGenArray<>();
        //obiekt "studentMyGenArray" wywołuje metodę add o podanych argumentach
        studentMyGenArray.add(new Student("Jean", 1701));

        //W tej sytuacji już rzutowanie jest niepotrzebne ponieważ użyliśmy właśnie szablonów
        Student student2 = studentMyGenArray.get(0);

        //Szybkie stworzenie obiektu "stringMyGenArray" o szablonie String
        MyGenArray<String> stringMyGenArray;

    }
}
