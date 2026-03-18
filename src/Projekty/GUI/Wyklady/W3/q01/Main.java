package Projekty.GUI.Wyklady.W3.q01;

//Publiczna Klasa Main
public
    class Main {

    //PSVM
    public static void main(String[] args) {

        //Stworzenie klasy anonimowej na podstawie interfejsu funkcyjnego "FuncInt"
        FuncInt fi = new FuncInt() {
            //Implementujemy i przysłaniamy metodę. Wyświetlając komunikat "tu"
            @Override
            public void method() {
                System.out.println("tu");
            }
        }; //OUTPUT:tu

        //Dla obiektu klasy anonimowej wywołujemy metodę "method"
        fi.method(); //OUTPUT:tu


        fi = () -> System.out.println("tu");

        fi = System.out::println;

        //Stworzenie tablicy "tab" o wielkości 10
        Object[] tab = new Object[10];

        //Stworzenie tablicy "calculable " zawierające elementy typu Interfejsu Calculabe
        Calculable[] calculables = {
            //pierwsza wartośc to suma dwóch wartości przez wywołanie konstruktora SUM
            new Sum(),
            //druga wartość to przemnożenie tych dwóch wartości
            (v1, v2) -> v1*v2,
            //A trzecia wartośc to przecielenie ich
            Div::divide
        };

        //Przeiterowanie forem po całej tablicy "calculables" a nastęnie wyświetlenie
        for (Calculable c : calculables)
            System.out.println(c+" "+c.calculate(5, 8) );
        //OUTPUT:Wyklady.W3.q01.Sum@17c68925 13
        //OUTPUT:Wyklady.W3.q01.Main$$Lambda$16/0x00000008000c2000@7e0ea639 40
        //OUTPUT:Wyklady.W3.q01.Main$$Lambda$15/0x00000008000c18c8@19dfb72a 0
    }
}
