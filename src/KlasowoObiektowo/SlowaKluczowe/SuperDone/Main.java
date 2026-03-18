package KlasowoObiektowo.SlowaKluczowe.SuperDone;

public class Main {
    public static void main(String[] args) {

        Payment payment1 = new Payment();
        Payment payment2 = new BlikPayment();
        BlikPayment blikPayment = new BlikPayment();

        payment1.process();
        System.out.println(payment1.a);

        System.out.println();

        payment2.process();
        System.out.println(payment2.a);

        System.out.println();

        blikPayment.process();
        System.out.println(blikPayment.a);
    }
}

class Payment{
    int a = 1;
    void process(){
        System.out.println("Przetwarzanie płatności");
    }


    }

class CardPayment extends Payment{
    @Override
    void process() {
        super.process();
        System.out.println("Płatność kartą");
    }
}

class BlikPayment extends Payment{
    int a = 3;
    @Override
    void process() {
        super.process();
        System.out.println("Płatność blikiem");
    }
}
