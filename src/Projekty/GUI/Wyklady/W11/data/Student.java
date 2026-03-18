package Projekty.GUI.Wyklady.W11.data;

import java.awt.*;

public
    class Student {

    private String name;
    private String surname;
    private int sNumber;

    private Color color;

    public Student(String name, String surname, int sNumber) {
        this.name = name;
        this.surname = surname;
        this.sNumber = sNumber;

        this.color = new Color(
            (int)(Math.random()*255),
            (int)(Math.random()*255),
            (int)(Math.random()*255)
        );
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getsNumber() {
        return sNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setsNumber(int sNumber) {
        this.sNumber = sNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
