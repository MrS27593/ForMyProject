package KlasowoObiektowo.SlowaKluczowe.VolatileDone;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyTask task = new MyTask();
        task.start();
        Thread.sleep(1000);
        task.stopTask();

        MyTask2 task2 = new MyTask2();
        task2.start();
        Thread.sleep(1000);
        task2.stopTask();

        Worker worker = new Worker();
    }
}

class MyTask extends Thread {

    private boolean running = true;

    public void run() {
        while (running) {
            // robi coś
        }
        System.out.println("Zatrzymano wątek");
    }

    public void stopTask() {
        running = false;
    }
}
class MyTask2 extends Thread{
    private volatile boolean running = true;

    public void run(){
        while (running){
            //smth happens
        }
        System.out.println("Thread stopps");
    }
    public void stopTask(){
        running=false;
    }
}

class Worker implements Runnable{

    private volatile boolean running = true;
    /*
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
        while (running){
            System.out.println("Pracuuje...");
        }
    }

    public void stop(){
        running=false;
    }
}