package Projekty.PPJ.Cwiczenia.C13;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("=-=-=- Zadanie 1 -=-=-=");
        try {
            FileInputStream fis = new FileInputStream("plik.txt");

            int val;

            while ((val = fis.read()) != -1)
                System.out.print((char) val);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        try {
            FileInputStream fis = new FileInputStream("zad1.txt");

            int val;
            int sum = 0;
            int actualValue = 0;

            while ((val = fis.read()) != -1) {
                if (val != ' ')
                    actualValue = actualValue * 10 + (val - '0');
                else {
                    sum += actualValue;
                    actualValue = 0;
                }
            }
            sum += actualValue;

            System.out.println(sum);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("=-=-=- Zadanie 3 -=-=-=");

        Scanner in = new Scanner(System.in);
        System.out.println("Ile plików chcesz stworzyć?");
        int a = in.nextInt();

        for (int i = 1; i <= a; i++) {
            try {
                PrintWriter pw = new PrintWriter("inputData" + i + ".txt");

                int[] arr = new int[10];
                for (int j = 0; j < 10; j++)
                    arr[j] = (int) (Math.random() * 10001);

                for (int j = 0; j < 9; j++)
                    for (int k = 0; k < 9 - j; k++)
                        if (arr[k] > arr[k + 1]) {
                            int tmp = arr[k];
                            arr[k] = arr[k + 1];
                            arr[k + 1] = tmp;
                        }

                for (int j = 0; j < 10; j++)
                    pw.println(arr[j]);

                pw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        int[] actualVals = new int[a];
        Scanner[] scannerArray = new Scanner[a];

        try {
            PrintWriter pw = new PrintWriter("result.txt");

            for (int i = 0; i < a; i++) {
                scannerArray[i] = new Scanner(new File("inputData" + (i + 1) + ".txt"));
                actualVals[i] = scannerArray[i].nextInt();
            }

            for (int i = 0; i < a * 10; i++) {
                int min = actualVals[0];
                int idx = 0;

                for (int j = 1; j < actualVals.length; j++)
                    if (actualVals[j] != 100000 && min > actualVals[j]) {
                        min = actualVals[j];
                        idx = j;
                    }

                pw.println(min);

                if (scannerArray[idx].hasNext())
                    actualVals[idx] = scannerArray[idx].nextInt();
                else
                    actualVals[idx] = 100000;
            }
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("=-=-=- Zadanie 5 -=-=-=");

        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        String bin = "";
        String quad = "";
        String oct = "";
        String hex = "";

        for (int i = 31; i >= 0; i--)
            bin += val >> i & 1;

        for (int i = 15; i >= 0; i--)
            quad += val >> (i*2) & 0b11;

        for (int i = 10; i >= 0; i--)
            oct += val >> (i*3) & 0b111;

        for (int i = 7; i >= 0; i--) {
            int tmp = val >> (i*4) & 0b1111;
            hex += (tmp < 10)?tmp:(char)('A' + (tmp - 10)) + "";
        }

        System.out.println("bin\t\t" + bin);
        System.out.println("quad\t" + quad);
        System.out.println("oct\t\t" + oct);
        System.out.println("hex\t\t" + hex);

    }


}

