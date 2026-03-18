package KlasowoObiektowo.KlasyZwykle.String4661Done.Klasowe.Valueof;

public class Main {
    public static void main(String[] args) {
        System.out.println("====String.valueOf()====");
        String a = String.valueOf(1);
        System.out.println("Metoda 1 valueOf(int a): "+a);
        String b = String.valueOf(1.92);
        System.out.println("Metoda 2 valueOf(double a): "+b);
        String c = String.valueOf(true);
        System.out.println("Metoda 3 valueOf(boolean a): "+c);
        c = String.valueOf(new Vehicle("car"));
        System.out.println("Metoda 4 valueOf(Object a): "+c);
        char[] charArray = {'a','b','c'};
        c = String.valueOf(charArray);
        System.out.println("Metoda 5 valueOf(char[] a): "+c);
        c = String.valueOf(charArray,0,2);
        System.out.println("Metoda 6 valueOf(char[] a, int a, int b): "+c);
        c = String.valueOf('a');
        System.out.println("Metoda 7 valueOf(char a): "+c);
        c = String.valueOf(468f);
        System.out.println("Metoda 8 valueOf(float a): "+c);
        c=String.valueOf(2945L);
        System.out.println("Metoda 9 valueOf(long a): "+c);
    }
}
class Vehicle{
    String name;
    public Vehicle(String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
