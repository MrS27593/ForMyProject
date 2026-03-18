package Projekty.UTP.Nauka.Nauka8.Nauka8_4;

import javax.swing.*;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        new Interruptible();
    }
}

class Interruptible{

    Lock lock = new ReentrantLock();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Task 1 begins");
            try{
                lock.tryLock(1000, TimeUnit.SECONDS);
                System.out.println("Task 1 entered");
            } catch (Exception e) {
                System.out.println("Task 1 interupted");
                throw new RuntimeException(e);
            }
            System.out.println("Task 1 stopped");
        }
    };

    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Task 2 begins");
            for (int i = 1 ; i <= 600 ; i++){
                if (Thread.currentThread().isInterrupted()){
                    break;
                }
                //
                if(Thread.currentThread().isInterrupted()){
                    break;
                }
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Task 2 stopped");
        }
    };

    Runnable runnable2 = new Runnable() {
        Scanner scanner = new Scanner(new FileInputStream(FileDescriptor.in).getChannel(),"Cp852");
        @Override
        public void run() {
            System.out.println("Task 3 begins");
            System.out.print(">>");
            while (scanner.hasNextLine()){
                try{
                    String s = scanner.nextLine();
                    System.out.print('\n'+s+"\n>>");
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
            System.out.println("Task 3 stopped - "+scanner.ioException());
        }
    };
    public Interruptible(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                lock.lock();
            }
        });

        executorService.execute(runnable);
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        JOptionPane.showMessageDialog(null,"Press Ok to stop all tasks");
        executorService.shutdownNow();
    }
}
