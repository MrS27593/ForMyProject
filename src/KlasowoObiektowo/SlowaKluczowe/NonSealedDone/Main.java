package KlasowoObiektowo.SlowaKluczowe.NonSealedDone;

public class Main {
    public static void main(String[] args) {

    }
}

sealed class Shape permits  Circle, Square {

}

non-sealed class  Circle extends Shape {

}

sealed class Square extends Shape permits ASquare {

}

final class ASquare extends Square{

}



sealed class Vehicle permits Car, Bike{}

non-sealed class Car extends Vehicle{

}
class SportCar extends Car{

}

non-sealed class Bike extends Vehicle{

}