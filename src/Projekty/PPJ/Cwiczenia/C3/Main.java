package Projekty.PPJ.Cwiczenia.C3;

public class Main {
    public static void main(String[] args) {

        System.out.println("=-=-=- Zadanie 1 -=-=-=");

        int x = 5;
        System.out.println((x = 4) * x);

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        System.out.println(((1+2*3+4)/(5-6)+78)/(9-10/11d));

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        int year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Rok " + year + " jest rokiem przestępnym");
        else
            System.out.println("Rok " + year + " nie jest rokiem przestępnym");

    }
}