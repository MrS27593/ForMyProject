package KlasowoObiektowo.SlowaKluczowe.SynchronizedDone;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(100);
    }
}

class BankAccount{
    private int balance = 1000;

    public synchronized void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+"wypłacił "+amount+", saldo "+balance);
        }else{
            System.out.println("Brak środków");
        }
    }
}

class Logger {
    private final Object lock = new Object();

    public void log(String message) {
        synchronized (lock) {

            System.out.println(Thread.currentThread().getName() + " " + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class SeatReservation{
    private boolean reserved = false;

    public synchronized boolean reserve(){
        if(!reserved){
            reserved = true;
            System.out.println(Thread.currentThread().getName() + "zarezerwował miejsce");
            return true;
        }else {
            System.out.println("Miejsce jest już zarezerwowane");
        }
        return false;
    }
}