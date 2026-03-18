package Projekty.GUI.Wyklady.W3.ex1;

//Publiczna klasa "Main'
public
    class Main {

    //PSVM
    public static void main(String[] args) {

        //Stworzenie obiektu "myArray" klasy MyArray
        MyArray myArray = new MyArray();
        //obiekt "myArray" wywołuje metodę add o argumencie 10
        myArray.add(10);

        //Wyświetlenie wartości na 0wym indeksie tablicy myArray
        System.out.println(myArray.get(0)); //OUTPUT: 10

        //Stworzenie obiektu "myStudentArray" klasy MyStudentArray
        MyStudentArray myStudentArray = new MyStudentArray();
        //obiekt "myStudentArray" wywołuje metodę add o argumentach Jean, 1701
        myStudentArray.add(new Student("Jean", 1701));

        //Wyświetlenie elementu tablicy "myStudentArray" na zerowym indeksie
        System.out.println(myStudentArray.get(0)); //OUTPUT: Jean 1701

        //Teraz tworzymy obiekt klasy student o takich samych parametrach jak w tablicy myStudentArray
        Student student = myStudentArray.get(0);

        //Stworzenie obiektu "myObjectArray" klasy MyObjectArray
        MyObjectArray myObjectArray = new MyObjectArray();
        //obiekt "myObjectArray" wywołuje metodę add o Jean, 1701
        myObjectArray.add(new Student("Jean", 1701));

        //Wyświetlenie elementu tablicy "myObjectArray" na zerowym indeksie
        System.out.println(myObjectArray.get(0));

        //Przypisanie wartości obiektu na wartośc na pozycji zerowej w tablicy myObjectArray po zrzutowaniu na Studenta
        Student student1 = (Student) myObjectArray.get(0);
    }
}
