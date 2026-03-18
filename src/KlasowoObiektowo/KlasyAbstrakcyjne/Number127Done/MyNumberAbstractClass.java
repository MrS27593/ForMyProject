package KlasowoObiektowo.KlasyAbstrakcyjne.Number127Done;

import java.math.BigDecimal;
import java.util.List;

public class MyNumberAbstractClass {
    public static void main(String[] args) {
        Number number = 10;
        Number number1 = 3.14;
        Number number2 = 100L;
        System.out.println(number.intValue());
        System.out.println(number.doubleValue());
        System.out.println(number.longValue());
        System.out.println();
        List<Number> numbers = List.of(1,2.5,10L,new BigDecimal(99.99));
        for(Number a :numbers){
            System.out.println(a);
        }
        System.out.println();
        Temperature temperature = new Temperature(37.5);
        Number temperatura = new Temperature(37.5);
        System.out.println(temperature);
        System.out.println(temperatura);
        System.out.println();
        Percentage percentage = new Percentage(32);
        System.out.println(percentage);
        Number percentage2 = new Percentage(98L);
        System.out.println(percentage2);
        Number percentage3 = new Percentage(982L);
        System.out.println(percentage2);
    }
}
 class Temperature extends Number{
    private double celcius;
    Temperature(double celcius){
        this.celcius=celcius;
    }
     @Override
     public int intValue() {
         return (int) celcius;
     }
     @Override
     public long longValue() {
         return (long) celcius;
     }
     @Override
     public float floatValue() {
         return (float) celcius;
     }
     @Override
     public double doubleValue() {
         return (double) celcius;
     }
     @Override
     public String toString() {
         return "Temperature{" +
                 "celcius=" + celcius +
                 '}';
     }
 }
 class Percentage extends Number{
    private double value;
    Percentage(double value){
        if(value<0 || value>100){
            throw new IllegalArgumentException("Zakres to 0-100");
        }else{
            this.value=value;
        }
    }
     @Override
     public int intValue() {
         return (int) value;
     }
     @Override
     public long longValue() {
         return (long) value;
     }
     @Override
     public float floatValue() {
         return (float) value;
     }
     @Override
     public double doubleValue() {
         return  value;
     }
     @Override
     public String toString() {
         return "Percentage{" +
                 "value=" + value +
                 '}';
     }
 }
