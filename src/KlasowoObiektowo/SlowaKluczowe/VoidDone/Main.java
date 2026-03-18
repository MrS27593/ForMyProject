package KlasowoObiektowo.SlowaKluczowe.VoidDone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

//        int a = met1(1,2); bład bo met1(a,b) nie zwraca wyniku
        met1(1,4);
        met2(1,2);
        int q = met2(1,6);
    }
    private static void met1(int a, int b){
        int c = a+b;
    }

    private static int met2(int a, int b){
        int c = a + b;
        System.out.println("Zwrócony wynik to "+c);
        return c;
    }
}
