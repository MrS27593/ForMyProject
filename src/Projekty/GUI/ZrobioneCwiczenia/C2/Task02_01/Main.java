package Projekty.GUI.ZrobioneCwiczenia.C2.Task02_01;

import Projekty.GUI.Cwiczenia.c2.Task02_01.*;

public
class Main{
    public static void main(String[] args) {
        //Stworzenie referencji tablicy która zawiera elementy typu TwoStringsOper
        TwoStringsOper[] a = {
                //Utworzenie obiektu klasy Concat
                new Concat() {},
                //Utworzenie obiektu klasy Concat
                new ConcatRev() {},
                //Utworzenie obiektu klasy Initials
                new Initials() {},
                //Utworzenie obiektu klasy Separ z argumentem typu String "loves"
                new Separ(" loves ") {
                }
        };
        //Przechodzimy przez wszystkie obiekty w tablicy
        for (TwoStringsOper op : a) {
            //Wyświetlenie dla każdego obiektu jego przysłoniętej metody apply.
            System.out.println(op.apply("Mary", "John"));
        }
    }
}