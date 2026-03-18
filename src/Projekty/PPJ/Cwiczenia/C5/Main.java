package Projekty.PPJ.Cwiczenia.C5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=-=-=- Zadanie 1 -=-=-=");
        Scanner in = new Scanner(System.in);

        double k1 = in.nextDouble();
        double k2 = in.nextDouble();
        double k3 = in.nextDouble();

        if (k1 + k2 + k3 == 180) {
            if (k1 < 90 && k2 < 90 && k3 < 90)
                System.out.println("Trójkąt ostrokątny");
            else
                System.out.println("Trójkąt nie jest ostrokątny");
        }else
            System.out.println("Trójkąt nie może istnieć na płaszczyźnie euklidesowej");

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double delta = Math.pow(b, 2) - 4*a*c;

        if (delta > 0){
            System.out.println("x1 = " + ( (-b-Math.sqrt(delta))/(2*a) ));
            System.out.println("x2 = " + ( (-b+Math.sqrt(delta))/(2*a) ));
        }else if (delta == 0){
            System.out.println("x0 = " + ( -b/(2*a) ));
        }else
            System.out.println("Brak miejsc zerowych");

        System.out.println("=-=-=- Zadanie 3 -=-=-=");

        double pkt = in.nextDouble();
        double max = in.nextDouble();

        double proc = pkt/max*100;

        if(proc >= 87.5)
            System.out.println(5);
        else if (proc >= 81.25)
            System.out.println(4.5);
        else if (proc >= 75)
            System.out.println(4);
        else if (proc >= 62.6)
            System.out.println(3.5);
        else if (proc >= 50)
            System.out.println(3);
        else
            System.out.println(2);

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 1;

        do{
            System.out.print(i + " ");
            i++;
        }while(i <= 10);
        System.out.println();

        i = 1;

        while(i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("=-=-=- Zadanie 5 -=-=-=");

        int wrt = 5;

        for (i = 1; i <= 10; i++){
            System.out.print(wrt*i + " ");
        }
        System.out.println();

        i = 1;

        do{
            System.out.print(wrt*i + " ");
            i++;
        }while(i <= 10);
        System.out.println();

        i = 1;

        while(i <= 10){
            System.out.print(wrt*i + " ");
            i++;
        }
        System.out.println();


        System.out.println("=-=-=- Zadanie 6 -=-=-=");

        int aa = 7;

        do{
            System.out.println("Jestem w do-while!");
        }while(aa < 7);

        while(aa  < 7){
            System.out.println("Jestem w while!");
        }

        System.out.println("=-=-=- Zadanie 7 -=-=-=");

        int last = 0;
        int sum = 0;
        int counter = 0;

        do{
            last = in.nextInt();
            sum += last;

            if(last != 0)
                counter++;

        }while(last != 0);

        System.out.println("Liczba wprowadzonych liczb: " +  counter + " sum tych liczb: " + sum);

        System.out.println("=-=-=- Zadanie 8 -=-=-=");

        double szereg = 0;

        for(int l = 0; l < 10; l++){
            szereg += 1/Math.pow(2,l);
            System.out.println(szereg);
        }

        System.out.println("=-=-=- Zadanie 9 -=-=-=");

        int m = in.nextInt();
        int d = in.nextInt();

        for (int j = m-1; j >= 1; j--){
            d += switch (j) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };
        }

        System.out.println(d);

        System.out.println("=-=-=- Zadanie 10 -=-=-=");

        int n = in.nextInt();

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n; j++) {
                if (k % 2 == 0)
                    System.out.print((j % 2 == 0) ? '*' : ' ');
                else
                    System.out.print((j % 2 == 0) ? ' ' : '*');
            }
            System.out.println();
        }

    }


}

