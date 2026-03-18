package KlasowoObiektowo.SlowaKluczowe.ExtendsDone;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal animal1 = new Dog();
//        Dog dog1 = new Animal(); error

    }
}
class Animal{
    void makeSound(){
        System.out.println("Zwierze wydaje dzwięk");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("hau hau");
    }
}

abstract class Shape{
    abstract double area();
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this.r = r;
    }
    @Override
    double area() {
        return r*Math.PI*r;
    }
}

class Engine{

}

class Car{
    private Engine engine;
}