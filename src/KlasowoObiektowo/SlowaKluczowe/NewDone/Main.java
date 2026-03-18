package KlasowoObiektowo.SlowaKluczowe.NewDone;

public class Main {
    public static void main(String[] args) {
        String s = new String("Hello");

        int[] numbers = new int[6];
        String[] names = new String[7];

        Shape shape = new Shape() {
            void draw(){
                System.out.println("Drawing shape");
            }
        };

        int x = 5;

    }
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }

    Person person = new Person("Alice");
    Person person2 = person;
}

abstract class Shape{

}

class Example{
    Example e = new Example();
}

