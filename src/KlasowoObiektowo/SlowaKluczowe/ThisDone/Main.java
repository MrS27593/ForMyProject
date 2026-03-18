package KlasowoObiektowo.SlowaKluczowe.ThisDone;

public class Main {
    public static void main(String[] args) {

    }
}

class Person{
    String name;
    int age;
    Person(String name){
        this.name=name;
    }

    Person(){
        this("Nieznany",0);
    }

    Person(String name, int age){
        this.name= name;
        this.age = age;
    }
}

class Car{
    String model;
    void printThis(){
        System.out.println(this);
    }

    void passThis(Car other){
        other.showOwner(this);
    }

    void showOwner(Car owner){
        System.out.println("Owner: "+owner.model);
    }
}

class Example{
    int x;

    void setX(int x){
        this.x=x;
    }
}

class Point{
    int x,y;

    Point(){
        this(0,0);
    }

    public Point(int i, int i1) {
        this.x=i;
        this.y=i1;
    }
}