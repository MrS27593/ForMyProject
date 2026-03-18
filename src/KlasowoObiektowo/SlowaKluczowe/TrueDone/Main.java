package KlasowoObiektowo.SlowaKluczowe.TrueDone;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        boolean a = true;
        boolean b = false;

        //int x = true; BŁAD

        // if (1) BŁĄD

        // boolean c = null; BŁĄD



        HelpClass.met();


    }
}

class HelpClass{

    private static boolean isLoggedIn = true;
    private static boolean isAdmin = true;
    public static void met(){
        while (true){
            System.out.println("OK");
        }
    }

    public static void met2(){
        for(;;){
            System.out.println("Nieskończona pętla");
        }
    }

    public static void met3(){
        if(isLoggedIn&&isAdmin){
            System.out.println("Uzyskujesz dostęp");
        }
    }

    public static boolean isAdult(int age){
        if (age >= 18){
            return true;
        }else {
            return false;
        }
    }

    public static void met4(){
        if(isAdult(20)){
            System.out.println("Podany wiek daje pełnoletniość");
        }
    }
}
