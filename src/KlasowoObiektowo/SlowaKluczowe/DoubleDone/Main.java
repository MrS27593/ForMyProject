package KlasowoObiektowo.SlowaKluczowe.DoubleDone;

public class Main {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.8);
        Double d2 = 3.8;
        double d3 = d2;

        double pi = 3.14159;
        double negative = -0.0005;
        double sum = pi+negative;
        System.out.println(sum);

        System.out.println();

        double a = 0.2;
        double suma = 0.1+0.1;
        System.out.println(a==suma);

        System.out.println();

        double q = 0.1 + 0.2;
        double b = 0.3;
        System.out.println(q == b); // false (!)

        System.out.println();

        double value = 3.14159;
        System.out.printf("%.2f", value);

        System.out.println();

        double d = 9.99;
        int i = (int) d;
        System.out.println(d);

        System.out.println();
    }
}
