package KlasowoObiektowo.Interfejsy.Future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(()->{
            Thread.sleep(2000);
            return "Wynik zadania";
        });

        System.out.println("Czekam na wynik... ");
        System.out.println();
        String wynik = future.get();
        System.out.println("Wynik:  "+wynik);

        System.out.println();

        String result = future.get();             // Zablokuje aż wynik będzie gotowy
        System.out.println(result);

        System.out.println();

        String result2 = future.get(1, TimeUnit.SECONDS); // Jak powyżej, ale z limitem czasu
        System.out.println(result2);

        System.out.println();

        boolean done = future.isDone();           // Czy zadanie się już zakończyło?
        System.out.println(done);

        System.out.println();

        boolean cancelled = future.isCancelled(); // Czy zostało anulowane?
        System.out.println(cancelled);

        System.out.println();

        boolean success = future.cancel(true);    // Anuluj zadanie
        System.out.println(success);

        System.out.println();

        executorService.shutdown();


    }
}
