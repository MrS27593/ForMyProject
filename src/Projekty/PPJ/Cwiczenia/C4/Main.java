package Projekty.PPJ.Cwiczenia.C4;

public class Main {

    public static void main(String[] args) {

        System.out.println("=-=-=- Zadanie 1 -=-=-=");

        System.out.println("Koniunkcja");
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);

        System.out.println("Alternatywa");
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);

        System.out.println("=-=-=- Zadanie 2 -=-=-=");

        boolean czyPada = true;

        if (czyPada)
            System.out.println("Pada");
        else
            System.out.println("Nie pada");

        System.out.println("=-=-=- Zadanie 3 -=-=-=");

        int tmp;

        if (czyPada)
            tmp = 5;
        else
            tmp = 8;

        int tmp2 = czyPada?5:8;

        System.out.println("=-=-=- Zadanie 4 -=-=-=");

        boolean czySwieciSlonce = false;

        if (czyPada){
            if (czySwieciSlonce)
                System.out.println("Tęcza");
            else
                System.out.println("Plucha");
        } else {
            if (czySwieciSlonce)
                System.out.println("Słonecznie");
            else
                System.out.println("Pochmurno");
        }

        if (czyPada && !czySwieciSlonce)
            System.out.println("Plucha");
        else if (czyPada && czySwieciSlonce)
            System.out.println("Tęcza");
        else if (!czyPada && czySwieciSlonce)
            System.out.println("Słonecznie");
        else
            System.out.println("Pochmurno");

        System.out.println(
                switch ( (czyPada?0:1) + (czySwieciSlonce?0:2) ){
                    case 0 -> "Tęcza";
                    case 1 -> "Słonecznie";
                    case 2 -> "Plucha";
                    default -> "Pochmurno";
                }
        );

        System.out.println("=-=-=- Zadanie 5 -=-=-=");

        if (3 > 5*2.0)
            System.out.print("Hello");
        System.out.print(" PPJ");

        System.out.println("\n=-=-=- Zadanie 6 -=-=-=");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > 0 && num2 > 0)
            System.out.println(num1 - num2);
        else
            System.out.println(num1 + num2);

    }


}

