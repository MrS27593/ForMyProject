package KlasowoObiektowo.SlowaKluczowe.WhileDone;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Pętla która wykona się 3 razy\n");
        int i = 0;
        while (i<3){
            System.out.println("Wartość zmiennej i to: "+i);
            i++;
        }

//        while (true){
//            System.out.println("Ta pętla nigdy się nie skończy");
//        }

        System.out.println("Teraz przedstawiona pętla która się wgl nie wykona\n");

        int x = 10;
        while (x < 6){
            System.out.println("Ta pętla nie wykona się ani razu\n");
        }

        System.out.println("Teraz przedstawimy while z wyjaśnieniem break i continue\n");

         i = 0;

        while (i < 5) {
            if (i == 3) {
                break; // Zakończ pętlę, gdy i wynosi 3
            }
            if (i == 1) {
                i++;
                continue; // Pomiń resztę kodu, gdy i wynosi 1
            }
            System.out.println("Wartość i: " + i);
            i++;
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int liczba = 0;
        while (liczba>=0){
            System.out.println("Podaj liczbę (ujemna kończy pętle");
            liczba= scanner.nextInt();
        }

        System.out.println();

        liczba = 2;
        while (liczba<=10){
            System.out.println(liczba);
            liczba+=2;
        }
    }
}
