package Projekty.GUI.Wyklady.W1.ex2;

import java.awt.*;

//Publiczna klasa Square dziedzicząca po klasie Figure, tak samo jak w przypadku Rectangle, Kwadrat musi dziedziczyć po figurze bo jest ową figurą.
public
    class Square
    extends Figure {

    //prywatne pole jako bok
    private int side;

    //Konstruktor podając argument nadaje długość boku, przypisuje podany argument metody do pola obiektu tej klasy
    public Square(int side) {
        this.side = side;
    }

    //Publiczna metoda "getArea", która zwraca double i licząca pole
    public double getArea(){
        return side*side;
    }
}
