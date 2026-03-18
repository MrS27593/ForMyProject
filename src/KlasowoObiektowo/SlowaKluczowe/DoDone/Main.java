package KlasowoObiektowo.SlowaKluczowe.DoDone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        do{
            System.out.println(1);
            a++;
        }while (a<10);

        Scanner scanner = new Scanner(System.in);
        int wybor;
        do{
            System.out.println("===Menu===");
            System.out.println("1. Start");
            System.out.println("2. Pomoc");
            System.out.println("3. Wyjście");
            wybor = scanner.nextInt();
        }while (wybor!=3);
        System.out.println("Nacisnąłeś 3 więc wyszedłeś z programu");
    }
}
