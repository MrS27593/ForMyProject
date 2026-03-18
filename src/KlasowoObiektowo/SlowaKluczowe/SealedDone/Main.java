package KlasowoObiektowo.SlowaKluczowe.SealedDone;

public class Main {
    public static void main(String[] args) {

    }
}
sealed class Shape permits Circle, Rectangle, Triangle{

}
final class Circle extends Shape {

}
non-sealed class Rectangle extends Shape{

}
sealed class Triangle extends Shape permits EquilateralTriangle,IsoscelesTriangle {

}

final class EquilateralTriangle extends Triangle {

}

final class IsoscelesTriangle extends Triangle {

}