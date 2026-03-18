package KlasowoObiektowo.SlowaKluczowe.InterfaceDone;

public class Main {
    public static void main(String[] args) {
        Flyable f = new Bird();
        f.fly();

        Payment payment = new BlikPayment();
        payment.pay(100);
    }
}

interface Flyable{

    int maxSpeed = 100;
    void fly();

    default void start(){
        System.out.println("Starting");
    }

    default void stop(){
        System.out.println("stop");
    }
}

class Bird implements Flyable{

    /**
     *
     */
    @Override
    public void fly() {

    }
}

interface A{
    void a();
}

interface B{
    void b();
}

class C implements A,B{

    /**
     *
     */
    @Override
    public void a() {

    }

    /**
     *
     */
    @Override
    public void b() {

    }
}

interface Payment{
    void pay(double amount);
}

class CardPayment implements Payment{

    /**
     * @param amount
     */
    @Override
    public void pay(double amount) {
        System.out.println("Card payment: "+amount);
    }
}

class BlikPayment implements Payment{
    /**
     * @param amount
     */
    @Override
    public void pay(double amount) {
        System.out.println("Blik payment: "+amount);
    }
}

sealed interface Shape permits Circle, Square{

}

non-sealed class Circle implements Shape {

}

non-sealed class Square implements Shape {

}