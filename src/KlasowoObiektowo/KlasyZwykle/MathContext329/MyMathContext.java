package KlasowoObiektowo.KlasyZwykle.MathContext329;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MyMathContext {
    public static void main(String[] args) {
        MathContext mathContext = new MathContext(5, RoundingMode.CEILING);
        BigDecimal bigDecimal = new BigDecimal("1.283123");
        BigDecimal bigDecimal1 = new BigDecimal("2.2138123");
        BigDecimal bigDecimal2 = bigDecimal.multiply(bigDecimal1,mathContext);
        System.out.println("Wynik to: "+bigDecimal2);

        System.out.println("Metoda getPrecision() -> zwraca precyzję określoną"+mathContext.getPrecision());
        System.out.println("Metoda getRoundingMode() -> zwraca sposób zaokrąglenia"+mathContext.getRoundingMode());
        System.out.println(mathContext.toString());

        BigDecimal bigDecimal3 = new BigDecimal("3123.123");
        System.out.println(bigDecimal3.round(new MathContext(2,RoundingMode.FLOOR)));
        System.out.println(bigDecimal3.round(new MathContext(2,RoundingMode.DOWN)));
        System.out.println(bigDecimal3.round(new MathContext(2,RoundingMode.HALF_UP)));
        System.out.println(bigDecimal3.round(new MathContext(2,RoundingMode.HALF_DOWN)));

        MathContext mathContext1 = new MathContext("precision=3 roundingMode=CEILING");
        System.out.println(mathContext1.getPrecision());
        System.out.println(mathContext1.getRoundingMode());
    }
}
