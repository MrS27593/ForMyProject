package Projekty.GUI.Cwiczenia.c3.Task03_01;

public
    class Parabola
    implements FunDD{
    double a, b, c;
    public Parabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double fun(double x) {
        return (a*(x*x))+(b*x)+c;
    }
}
