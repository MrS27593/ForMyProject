package KlasowoObiektowo.Interfejsy.Executor138;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(()->{
            System.out.println("Zadanie wykonane w oddzielnym wątku "+Thread.currentThread());
        });

        System.out.println("To działa równolegle z tym co jest już napisane");
    }
}
