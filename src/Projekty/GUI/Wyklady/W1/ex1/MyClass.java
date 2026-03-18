package Projekty.GUI.Wyklady.W1.ex1;

//Publiczna klasa MyClass
public
    class MyClass {

    //publiczna statyczna czyli klasowa/nieobiektowa zmienna val zainicjalizowana wartościa 30
    public static int val= 30;

    //PSVM
    public static void main(String[] args) {

        //Tworzymy obiekt klasy anonimowej tworząc klasę anonimową w ciele której tworzymy metodę show a następnie ją wywołujemy z tego właśnie obiektu
        new Object(){
            public void show(){
                System.out.println("anon");
            }
        }.show(); //OutPut:anon



        //Tworzymy obiekt klasy anonimowej z dwiema metodami publicznymi jedna show wyświetla anon a druga metoda toString() zwraca Stringa ANON
        var obj = new Object(){
            //publiczna metoda "show" niezracająca, która wyświetla "anon"
            public void show(){
                System.out.println("anon");
            }

            //Przysłonięcie metody toString, która zwraca stringa a mianowicie ANON
            @Override
            public String toString() {
                return "ANON";
            }
        };


        //Wyświeltenie wywołania metody toString() zwracająca napis ANON
        System.out.println(
            obj.toString()
        ); //OutPut: ANON



        //Obiekt obj wywołuje metodę show która wyświetla "anon" Output: anon
        obj.show();

//        int val = 20;


        Object obj2 = new Object(){
//            int val = 10;
            //Przysłonięcie metody toString która zwracać będzie wartośc zmiennej val
            @Override
            public String toString() {
                return ""+val;
            }
        };

        //Wyświetlenie obiektu o nazwie obj2, który to wywołuje przysłonięta metodę toString() zwracającą wartość zmiennej statycznej nieobiektowej val wyświetlenie: 30
        System.out.println(obj2);

        //Stworzenie obiektu klasy MyClass i wywołanie na nim metody method() co tworzy nowy obiekt i wywołuje metode toString a następnie wyświetla ten obiekt daje linikę OutPut: 32 22 12
        new MyClass().method();
    }

    //Publiczna zmienna "val1" typu int
    public int val1 = 32;

    public void method(){
        //int val1 = 22;
        int val2 = 22;


        //Stworzenie obiektu klasy anonimowej gdzie zainicjalizowana jest zmienna val1 o wartości 12 i metoda toString() zwracająca Stringa który ten zwraca wartość val1, wartość zmiennej wartość zmiennej obiektowej val1
        Object obj = new Object(){
            int val1 = 12;
            @Override
            public String toString() {
                return ""+MyClass.this.val1+" "+val2+" "+val1;
            }
        };

        //Wyświetlamy zawartość obiektu czyli wyświetlenie tych 3 wyżej wartości.
        System.out.println(obj);
    }
}


//Stworzenie klasy zewnętrznej która posiada publiczną metodę fun nic niezwracającąubliczna lub pakietowa
class OuterClass{
    public void fun() {
        //Tworzymy obiekt o "v" klasy Inner
        Inner v = new Inner();
    }

    //Klasa wewnętrzna o nazwie Inner
    class Inner{

    }
}