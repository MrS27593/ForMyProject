package KlasowoObiektowo.KlasyZwykle.String4661Done.Klasowe.Format;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("===String.format()===");
        String a = "asdasdfg8734nkldsf'.,34[pwqd";
        String name="Marcin";
        int wiek = 25;

        System.out.println("Metoda 1 String.format z użyciem %s i %d");
        //Do wyświetlania Stringów używane jest %s a do liczb %d
        String b = String.format("Tutaj wypisze pewien string: na imię mam %s, i mam %d lat",name,wiek);
        System.out.println(b);

        System.out.println();

        double pi=3.14159;
        System.out.println("Metoda 2 String.format z użyciem %.2f");
        String result=String.format("Value of Pi: %.2f",pi);
        System.out.println(result);

        System.out.println();

        System.out.println("Metoda 3 String.format z użyciem %x");
        int liczba = 1723;
        String c =String.format("Liczba w systemie szesnastkowym %x",liczba);
        System.out.println(c);

        System.out.println();

        System.out.println("Metoda 4 String.format z użyciem %tA,  %tY, %tm, %tdf");
        LocalDate today = LocalDate.now();
        String alreadyFormated = String.format("Dzisiejsza data to %tA, %<tB %<td, %<tY\"",today);
        System.out.println(alreadyFormated);



    }
}
