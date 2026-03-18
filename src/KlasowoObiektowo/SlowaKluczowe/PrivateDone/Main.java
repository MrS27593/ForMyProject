package KlasowoObiektowo.SlowaKluczowe.PrivateDone;

public class Main {
    public static void main(String[] args) {

    }
}

class User{
    private String password;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Wiek nie może być ujemy");
        }
        this.age = age;
    }
}

class PaymentService{
    public void processPayment(){
        validate();
        execute();
    }

    private void validate(){

    }
    private void execute(){

    }
}

class Singleton{
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return INSTANCE;
    }
}

class Parent{
    private int x = 10;

}
class Child extends Parent{
    void test(){
        // super.x = 102; ER ponieważ x w klasie bazowej Parent jest private a nie protected czy public
    }
}

record Person(String name, int age){
    private static int counter = 0;
}