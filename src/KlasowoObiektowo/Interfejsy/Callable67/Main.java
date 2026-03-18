package KlasowoObiektowo.Interfejsy.Callable67;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(2);
            return 42;
        };

        Future<Integer> future = executorService.submit(task);

        System.out.println("Zadanie zostało przesłane, czekam ... ");

        Integer result = future.get();
        System.out.println("Wynik: "+result);

        executorService.shutdown();

        System.out.println();

        List<Callable<String>> tasks = List.of(
                ()->"A",
                ()->"B",
                ()->"C");
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);

        List<Future<String>> resultes = executorService1.invokeAll(tasks);

        for (Future<String> f : resultes){
            System.out.println(f.get());
        }
    }
}
