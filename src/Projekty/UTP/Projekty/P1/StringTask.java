package Projekty.UTP.Projekty.P1;

public class StringTask implements Runnable{

    String napis;
    private int ilerazy;
    private final StringBuilder result = new StringBuilder();
    TaskState stan;
    private Thread watek;
    boolean aborted;

    public StringTask(String napis, int ilerazy){
        this.napis=napis;
        this.ilerazy = ilerazy;
        this.stan = TaskState.CREATED;
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
        stan = TaskState.RUNNING;
        for (int i = 0; i < ilerazy; i++) {
            if (aborted) {
                stan = TaskState.ABORTED;
                Thread.currentThread().interrupt();
            }
            result.append(napis);
        }
        stan = TaskState.READY;
    }
    // zwracającą wynik konkatenacji
    public String getResult(){
        return result.toString();
    }

    // zwracającą stan zadania
    public TaskState getState(){
        return this.stan;
    }
    // uruchamiającą zadanie w odrębnym watku
    public void start(){
        if (stan != TaskState.CREATED) return; // nie uruchamiaj drugi raz
        watek = new Thread(this);  // twórz nowy wątek
        watek.start();
    }
    // przerywającą wykonanie kodu zadania i działanie wątku
    public void abort(){
        aborted = true;
        stan = TaskState.ABORTED;
        if (watek!=null){
            watek.interrupt();
        }
    }

    // zwracająca true, jeśli wykonanie zadania się zakończyło normalnie lub przez przerwanie, false w przeciwnym razie
    public boolean isDone() {
        boolean isDone ;
        if(stan== TaskState.READY || stan== TaskState.ABORTED){
            isDone = true;
        }else {
            isDone = false;
        }
        return isDone;
    }
}
