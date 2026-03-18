package KlasowoObiektowo.Interfejsy.Runnable70Done;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MyRunnable implements Runnable{
    public static void main(String[] args) {

    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Wątek działa "+Thread.currentThread().getName());
    }
}
class Main{
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Zadanie w wątku anonimowym");
            }
        });

        thread1.start();

        Thread thread2 = new Thread(()->{
            System.out.println("Wątek teraz działa za pomocą lambdy");
        });

        thread2.start();

        Thread downloadThread = new Thread(()->{
            try{
                Thread.sleep(2000);
                System.out.println("Pobieranie zakończone");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        downloadThread.start();

        Runnable backgroundTask = () -> {
            while (true){
                try{
                    Thread.sleep(5000);
                    System.out.println("W tle wykonuję backup");
                } catch (InterruptedException e) {
                    break;
                }
            }
        };

        Thread backgroundThread = new Thread(backgroundTask);
        backgroundThread.setDaemon(true);
        backgroundThread.start();

        for(int i =0; i<5;i++){
            int finalI = i;
            new Thread(()-> System.out.println("Zadanie "+finalI)).start();
        }
    }
}

class ExecutorExample{
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(()->{
            System.out.println("Zadanie wykonane przez Executora");
        });

        executorService.shutdown();
    }
}
