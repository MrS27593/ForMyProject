package Projekty.PPJ.Cwiczenia.C7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=-=-=- Zadanie 1 -=-=-=");

        Scanner in = new Scanner(System.in);

        char[] tab = new char[5];

        for (int i = 0; i < tab.length; i++)
            tab[i] = (char) (Math.random()*('Z'-'A'+1)+'A');

        for (int i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");
        System.out.println();

        int sum = 0;

        while (sum != tab.length){
            char c = in.next().charAt(0);
            int counter = 0;

            for (int i = 0; i < tab.length; i++)
                if (tab[i] == c){
                    counter++;
                    tab[i] = 0;
                }

            System.out.println(c + " -> " + counter);

            sum += counter;
        }

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        int[] arr = {153, 333, 370, 515, 407, 80};

        for (int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            int counter = 0;

            while (tmp > 0){
                counter++;
                tmp /= 10;
            }

            sum = 0;
            tmp = arr[i];

            while (tmp > 0){
                sum += Math.pow(tmp % 10, counter);
                tmp /= 10;
            }

            if (sum == arr[i])
                System.out.println(arr[i]);
        }

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        int[] tab2 = new int[(int)(Math.random()*6+10)];

        for (int i = 0; i < tab2.length; i++)
            tab2[i] = i;

        for (int i = 0; i < 100; i++){
            int id1 = (int)(Math.random() * tab2.length);
            int id2 = (int)(Math.random() * tab2.length);

            int tmp = tab2[id1];
            tab2[id1] = tab2[id2];
            tab2[id2] = tmp;
        }

        for (int i = 0; i < tab2.length; i++)
            System.out.print(tab2[i] + "\t");
        System.out.println();

        for (int i = 0; i < tab2.length; i++){
            for (int j = 0; j < tab2.length; j++)
                System.out.print((tab2[j] == i)?"*\t":".\t");
            System.out.println();
        }


    }
}
