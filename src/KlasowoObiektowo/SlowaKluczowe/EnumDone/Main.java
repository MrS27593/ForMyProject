package KlasowoObiektowo.SlowaKluczowe.EnumDone;

public class Main {
    public static void main(String[] args) {
        System.out.println(Planet.EARTH.surfaceGravity());;

        System.out.println();

        Day date = Day.Friday;
        switch (date){
            case Monday -> System.out.println("Poniedziałek");
            case Tuesday -> System.out.println("Wtorek");
            case Wednesday -> System.out.println("Środa");
            case Thursday -> System.out.println("Czwartek");
            case Friday -> System.out.println("Piątek");
            case Saturday -> System.out.println("Sobota");
            case Sunday -> System.out.println("Niedziela");

        }

        System.out.println();

        for(Day d:Day.values()){
            System.out.println(d+" ma indeks "+d.ordinal());

        }

        System.out.println();

        Colors.red.print();

        System.out.println();
    }
}


//===========================================

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

enum BloodGroup{
    A,B,AB,O
}

enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
}

interface Printable{
    void print();
}

enum Colors implements Printable{
    red,green,blue;

    @Override
    public void print() {
        System.out.println("Kolor to: "+this.name());
    }
}