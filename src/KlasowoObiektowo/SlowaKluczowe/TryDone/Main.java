package KlasowoObiektowo.SlowaKluczowe.TryDone;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try{

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
        //tutaj kod, który zawsze się wykona
        }

        System.out.println();

        try{
            int result = 10/0;
            System.out.println(result);
        }catch (Exception exception){
            System.out.println("Nie można dzielić przez 0");
        }finally {
            System.out.println("Ta częśc wykona się zawsze");
        }

        System.out.println();

        try {
            // kod
        } catch (NumberFormatException e) {
            // obsługa błędu konwersji liczby
        } catch (Exception e) {
            // ogólna obsługa
        }

        System.out.println();

        try{
            int[] tablica = new int[3];
            System.out.println(tablica[5]);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("podany indeks jest poza zasięgiem");
        }catch (Exception e){
            System.out.println("Jakis inny błąd");
        }

        System.out.println();

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println(scanner.nextLine());
        }
    }
}
