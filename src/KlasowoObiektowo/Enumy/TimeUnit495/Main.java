package KlasowoObiektowo.Enumy.TimeUnit495;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(1);
        TimeUnit.SECONDS.sleep(1);
        long seconds = TimeUnit.SECONDS.convert(2,TimeUnit.MINUTES);
        long ms = TimeUnit.HOURS.toMillis(1);
        System.out.println(ms);
//        lock.tryLock(5, TimeUnit.SECONDS);
//        future.get(1, TimeUnit.MINUTES);
//        queue.poll(500, TimeUnit.MILLISECONDS);


    }
}
