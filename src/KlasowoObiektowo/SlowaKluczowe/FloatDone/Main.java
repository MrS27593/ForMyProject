package KlasowoObiektowo.SlowaKluczowe.FloatDone;

public class Main {
    public static void main(String[] args) {
        float f = 3.14f;

        float min = 1.4e-45f;
        float max = 3.4028235e38f;

        float a = 5.5f;
        float b = 2.0f;

        float sum = a + b;
        float diff = a - b;
        float prod = a * b;
        float div = a / b;

        float price = 19.99f;
        float taxRate = 0.23f;

        float totalPricie = price * (1+taxRate);
        System.out.println("total price : "+totalPricie);

        double d = 9.87654321;
        float g = (float) d;
        System.out.println(g);
    }
}
