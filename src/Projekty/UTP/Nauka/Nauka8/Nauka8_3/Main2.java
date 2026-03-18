package Projekty.UTP.Nauka.Nauka8.Nauka8_3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i  = 1 ; i <= 4 ; i++){
            executorService.execute(new Task("Task "+i));
        }

        Thread.yield();
        executorService.shutdown();

        try{
            executorService.execute(new Task("task after shutdown"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("Teminated: "+executorService.isTerminated());
    }
}

 class Task2 implements Runnable{

    String name;

    public Task2(String name ){
        this.name = name;
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
        for (int i = 1 ; i<4 ; i++){
            System.out.println("Task "+i);
        }
    }
}
