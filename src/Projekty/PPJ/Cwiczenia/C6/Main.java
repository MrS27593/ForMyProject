package Projekty.PPJ.Cwiczenia.C6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=-=-=- Zadanie 1 -=-=-=");

        for (int i = 75; i <= 150; i++)
            System.out.println((char)i + " - " + i);

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        Scanner in = new Scanner(System.in);

        int money = (int)(Math.round(in.nextDouble()*100)); // kwota w groszach

        int a = 0;

        if(money>=500) {
            while (money >= 500) {
                a++;
                money -= 500;
            }
            System.out.println(a + " * 5 zł");
            a = 0;
        }

        if(money>=200) {
            while (money >= 200) {
                a++;
                money -= 200;
            }
            System.out.println(a + " * 2 zł");
            a = 0;
        }

        if(money>=100) {
            while (money >= 100) {
                a++;
                money -= 100;
            }
            System.out.println(a + " * 1 zł");
            a = 0;
        }

        if(money>=50) {
            while (money >= 50) {
                a++;
                money -= 50;
            }
            System.out.println(a + " * 50 gr");
            a = 0;
        }

        if(money>=20) {
            while (money >= 20) {
                a++;
                money -= 20;
            }
            System.out.println(a + " * 20 gr");
            a = 0;
        }

        if(money>=10) {
            while (money >= 10) {
                a++;
                money -= 10;
            }
            System.out.println(a + " * 10 gr");
            a = 0;
        }

        if(money>=5) {
            while (money >= 5) {
                a++;
                money -= 5;
            }
            System.out.println(a + " * 5 gr");
            a = 0;
        }

        if(money>=2) {
            while (money >= 2) {
                a++;
                money -= 2;
            }
            System.out.println(a + " * 2 gr");
            a = 0;
        }

        if(money>=1) {
            while (money >= 1) {
                a++;
                money -= 1;
            }
            System.out.println(a + " * 1 gr");
        }

        System.out.println("=-=-=- Zadanie 3 -=-=-=");

        byte b = in.nextByte();

        char c = (char) ((b < 10) ? ('0' + b) : ('A' + (b - 10)));
        System.out.println(c);

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        int n = in.nextInt();
        System.out.println("n\tn^2\tn^3\tn^4");
        for (int i = 1; i < n; i++) {
            int pow = i;
            for (int j = 1; j <= 4; j++){
                System.out.print(pow + "\t");
                pow *= i;
            }
            System.out.println();
        }

        System.out.println("=-=-=- Zadanie 5 -=-=-=");

        int size = in.nextInt();

        for (int i = -size; i<=size; i++){
            int tmp = Math.abs(i);

            for (int j=0; j<tmp; j++)
                System.out.print('.');

            for (int j=0; j<(2*size+1-2*tmp); j++)
                System.out.print('*');

            for (int j=0; j<tmp; j++)
                System.out.print('.');

            System.out.println();
        }


        System.out.println("=-=-=- Zadanie 6 -=-=-=");

        double[] tab = new double[10];

        for (int i = 0; i < tab.length; i++)
            tab[i] = Math.random()*10;

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();

        for (int i = 0; i < tab.length; i+=2)
            System.out.print(tab[i] + " ");
        System.out.println();

        for (int i = 0; i < tab.length; i++)
            if (((int)tab[i])%2 != 0)
                System.out.print(tab[i] + " ");
        System.out.println();

        System.out.println("=-=-=- Zadanie 7 -=-=-=");

        char[] tab2 = {'z', 'b', 'c'};

        int min = 0;

        for (int i = 1; i < tab2.length; i++)
            if (tab2[i] < tab2[min])
                min = i;

        System.out.println("Min: " + min);


    }

}

