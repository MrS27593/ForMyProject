package Projekty.GUI.Wyklady.W1.ex2;

import java.awt.*;

//Publiczna klasa Rectangle która rozrzesza/dziedziczy po Figure, logiczne bo każdy prostokąt jest figurą
public
    class Rectange
    extends Figure {

    //dwa prywatne pola typu int "bokA" i "bokB"
    private int sideA, sideB;

    //W konstruktorze podając argumenty przypisujemy wartości tym bokom
    public Rectange(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //publiczna metoda licząca powierzchnie
    public double getArea(){
        return sideA*sideB;
    }
}
