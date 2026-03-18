package KlasowoObiektowo.KlasyZwykle.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            return "Witaj ";
        })
                .thenApply(a -> a + "świecie")
                .thenAccept(System.out::println);
    }
}
