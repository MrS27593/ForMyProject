package Projekty.GUI.Wyklady.W1.ex2;

import java.awt.*;

// utworzenie publicznej klasy abstrakcyjnej Figure -> skoro metoda jest abstrakcyjna to klasa musi być abstrakcyjna, nie działa to na odwrót tzn. Klasa może być abstrakcyjna nie zawierając metody abstrakcyjnej
public
    abstract class Figure {

    //Prywatna zmienna "color" klasy Color
    private Color color;

    //Publiczna abstrakcyjna metoda "getArea" zwracająca double, licząca pole powierzchni. Należy pamiętać że metoda abstrakcyjna nie może mieć ciała.
    public abstract double getArea();
}
