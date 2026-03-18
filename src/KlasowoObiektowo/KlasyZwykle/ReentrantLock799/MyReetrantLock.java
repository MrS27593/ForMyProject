package KlasowoObiektowo.KlasyZwykle.ReentrantLock799;

import java.util.concurrent.locks.ReentrantLock;

public class MyReetrantLock {
    public static void main(String[] args) {

        KontoBankowe kontoBankowe = new KontoBankowe(100);

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 1 ; i < 6 ; i++){
                    kontoBankowe.wplacic(50);
                    kontoBankowe.wyplacic(70);
                }
            }
        };

        Thread thread1 = new Thread(runnable1,"Klient1");
        Thread thread2 = new Thread(runnable1,"Klient2");

        thread1.start();
        thread2.start();
    }
}

class KontoBankowe{
    private double wplata;
    private double wyplata;
    private double saldoPoczatkowe;

    private ReentrantLock reentrantLock = new ReentrantLock();

    public KontoBankowe(double saldoPoczatkowe){
        this.saldoPoczatkowe=saldoPoczatkowe;
    }

    public void wplacic(double kwota){
        reentrantLock.lock();
        try{
            saldoPoczatkowe+=kwota;
            System.out.println(Thread.currentThread().getName() + "Saldo zostało powiększone o kwotę "+kwota);
        } catch (Exception e) {
            if(kwota<0)
                System.out.println("Uwaga chcesz wpłacić ujemną kwotę");
            throw new RuntimeException(e);
        }finally {
            System.out.println("Obecny stan konta to "+saldoPoczatkowe);
            reentrantLock.unlock();
        }
    }

    public void wyplacic(double kwota){
        reentrantLock.lock();
        try{
            saldoPoczatkowe-=kwota;
            System.out.println(Thread.currentThread().getName() + "Saldo zostało zmniejszone o kwotę "+kwota);
        } catch (Exception e) {
            if(kwota<0)
                System.out.println("Uwaga chcesz wypłacić ujemną kwotę");
            throw new RuntimeException(e);
        }finally {
            System.out.println("Obecny stan konta to "+saldoPoczatkowe);
            reentrantLock.unlock();
        }
    }
}
