package Projekty.PPJ.Cwiczenia.C8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=-=-=-=- Zadanie 1 -=-=-=-=");

        float[][] z3 = new float[8][8];

        fill(z3);
        show(z3);

        float[] res = diaginalsSum(z3);
        System.out.println(res[0]);
        System.out.println(res[1]);

        System.out.println("=-=-=-=- Zadanie 2 -=-=-=-=");

        Scanner in = new Scanner(System.in);
        show(in.nextInt());

        System.out.println("=-=-=-=- Zadanie 3 -=-=-=-=");

        int wrt = 5;
        System.out.println(wrt);
        modifyValue(wrt);
        System.out.println(wrt);

        System.out.println("=-=-=-=- Zadanie 4 -=-=-=-=");

        for (int b : splitToDigits(12764))
            System.out.print(b + " ");
        System.out.println();
    }

    public static void show(int wrt){
        System.out.println(wrt);
    }

    public static void modifyValue(int wrt){
        System.out.println(wrt);
        wrt *= 5;
        System.out.println(wrt);
    }

    public static float random(){
        return (float) (Math.random() * 10);
    }

    public static void fill(float[][] tab){
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                tab[i][j] = random();
    }

    public static void show(float[][] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++)
                System.out.print(tab[i][j] + "\t");
            System.out.println();
        }
    }

    public static float[] diaginalsSum(float[][] tab){
        float sum1 = 0;
        float sum2 = 0;

        for (int i = 0; i < tab.length; i++){
            sum1 += tab[i][i];
            sum2 += tab[i][tab[i].length-1-i];
        }
        return new float[]{sum1, sum2};
    }

    public static int countDigits(int number){
        int counter = 0;
        while (number > 0){
            counter++;
            number /= 10;
        }
        return counter;
    }

    public static int[] splitToDigits(int number){
        int[] tmp = new int[countDigits(number)];
        int index = tmp.length-1;
        while (number > 0){
            tmp[index--] = number % 10;
            number /= 10;
        }
        return tmp;
    }

}