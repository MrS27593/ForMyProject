package KlasowoObiektowo.SlowaKluczowe.IntDone;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        b = 3;
        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

         a = 10;
         long l = a;

         l = 10000000000L;
         a = (int) l;

         for (int i = 0 ; i < 10 ; i++){
             System.out.println(i);
         }
    }
}

class Order{
    int quantity;
    int pricePerItem;

    int totalPrice(){
        return quantity*pricePerItem;
    }
}