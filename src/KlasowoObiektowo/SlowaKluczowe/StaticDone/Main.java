package KlasowoObiektowo.SlowaKluczowe.StaticDone;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(6));

        Outer.Inner inner = new Outer.Inner();
        inner.greet();

        Logger.logIn("hejeee");
        Logger.logIn("siemkaaa");
    }

}
class Counter{
    static int count = 0;

    void increment(){
        count++;
    }
}

class MathUtils{
    static int square(int i){
        return i*i;
    }
}

class Config{
    static String version;
    static{
        version = "1.0";
        System.out.println("Konfiguracja zakończona");
    }
}

class Outer{
    static class Inner{
        void greet(){
            System.out.println("Powitanie z klasy wewnętrznej");
        }
    }
}

class Logger{
    private static int logCount = 0;
    static void  logIn(String message){
        logCount++;
        System.out.println("To jest "+logCount+ " zalogowanie o wiadomości "+message);
    }
}

class BankAccount{
    private static double totalBalance = 0.0;

    static synchronized void addToBalance(double amount){
        totalBalance+=amount;
        System.out.println("Saldo globalne "+totalBalance);
    }
}