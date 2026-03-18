package Projekty.GUI.Wyklady.W1.ex3;

//Import klas z pakietu awt z pakietu java
import java.awt.*;

//Publiczna abstrakcyjna klasa Figure
public
    abstract class Figure {

    //prywatne pole o nazwie color typu Color
    private Color color;

    //Publiczna metoda zwracająca double i licząca pole figury
    public abstract double getArea();
}
