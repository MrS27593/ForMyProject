package KlasowoObiektowo.SlowaKluczowe.ImplementsDone;

public class Main {
}

interface RunnableTask{
    void run();
}
class Job implements RunnableTask{

    /**
     *
     */
    @Override
    public void run() {
        System.out.println("Job running");
    }
}

class A extends B implements C,D{

}

class B{

}

interface C{

}

interface D{

}

interface Flyable{
    void fly();
}

interface Swimable{
    void swim();
}

class Duck implements Flyable,Swimable{

    /**
     *
     */
    @Override
    public void fly() {

    }

    /**
     *
     */
    @Override
    public void swim() {

    }
}

interface Service{
    void execute();
}

class MyService implements Service{

    /**
     *
     */
    @Override
    public void execute() {

    }
}

interface Logger{
    default void log(){
        System.out.println("LOG");
    }
}

class FileLogger implements Logger{

}

interface P {
    default void test(){

    }
}

interface O{
    default void test(){

    }
}

class Klasa implements P,O{

    /**
     *
     */
    @Override
    public void test() {
        P.super.test();
        O.super.test();
    }
}

interface NotificationSender{
    void send(String message);
}

class EmailSender implements NotificationSender{

    /**
     * @param message
     */
    @Override
    public void send(String message) {
        System.out.println("Email "+message);
    }
}

class SmsSender implements NotificationSender{

    /**
     * @param message
     */
    @Override
    public void send(String message) {
        System.out.println("SMS "+message);
    }
}

class NotificationService{
    private final NotificationSender sender;


    NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    void notifyUser(String msg){
        sender.send(msg);
    }
}