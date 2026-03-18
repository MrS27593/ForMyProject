package KlasowoObiektowo.SlowaKluczowe.BooleanDone;

public class Main {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean result = a && b;  // Wynik będzie false, bo b jest false

        boolean c = true;
        boolean d = false;
        boolean result2 = c || d;  // Wynik będzie true, bo a jest true

        boolean e = true;
        boolean result3 = !e;  // Wynik będzie false, ponieważ !true to false

        boolean isAdult = true;
        if(isAdult){
            System.out.println("Jestem dorosły");
        }else{
            System.out.println("nie jestem dorosłym");
        }

        int counter=1;
        boolean isRunning = true;
        while(isRunning){
            counter++;
            if(counter==5){
                isRunning=false;
            }
        }
        System.out.println("Program zakończony po "+(counter-1)+"pętlach");

        int number = 4;

        if(isEven(4)){
            System.out.println(number+"jest liczba parzystą");
        }else{
            System.out.println(number+" nie jest liczbą parzystą");
        }


    }
    public static boolean isEven(int number){
        return number%2==0;
    }


}
