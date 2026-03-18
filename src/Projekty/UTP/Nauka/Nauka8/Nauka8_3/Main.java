package Projekty.UTP.Nauka.Nauka8.Nauka8_3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        for(int i = 1 ; i < 4 ; i++){
            executor.execute(new Task("Task "+i));
        }

    }
}
class Task implements Runnable{
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
    private String name;
    public Task(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 1; i < 4 ; i++){
            System.out.println(name+ " "+i);
            Thread.yield();
        }
    }
}
