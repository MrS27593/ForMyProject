package KlasowoObiektowo.SlowaKluczowe.InstanceofDone;
public class Main {
    public static void main(String[] args) {
        String obj="";
        if (obj instanceof String){
            System.out.println("Ten objekt to String");
        }
        Integer x = 10;
        System.out.println(x instanceof Integer);
        Object o = null;
        System.out.println(o instanceof Object);
        Animal a = new Dog();
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
        Bird bird = new Bird();
        System.out.println(bird instanceof Flyable);
        if (obj instanceof String){
            String s = (String) obj;
            System.out.println(s.length());
        }
//
//        if(obj instanceof String s){
//            System.out.println(s.length());
//        }
    }
    void process(Payment payment) {
        if (payment instanceof BlikPayment blik) {
            System.out.println("Logowanie BLIK");
            blik.pay(100);
        } else if (payment instanceof CardPayment card) {
            System.out.println("Sprawdzanie limitu karty");
            card.pay(100);
        }
    }
}
class Animal{
}
class Dog extends Animal{
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
        System.out.println("Card payment "+amount);
    }
}
class BlikPayment implements Payment{
    /**
     * @param amount
     */
    @Override
    public void pay(double amount) {
        System.out.println("Blik payment "+amount);
    }
}
interface Flyable{

}
class Bird implements Flyable{
    Bird bird = new Bird();
}