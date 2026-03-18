package KlasowoObiektowo.SlowaKluczowe.RecordDone;

public class Main {
    public static void main(String[] args) {
        User user = new User("Anna",25);
        System.out.println(user.name());
        System.out.println(user.age());

        OrderItem orderItem = new OrderItem("laptop",2,3500);
        System.out.println(orderItem.totalPrice());
    }
}

record User(String name, int age){}

record Product(String name, double price){
    public Product{
        if (price < 0){
            throw new IllegalArgumentException("Cena nie może być ujemna");
        }
    }
}

record Rectangle(double width, double height){
    public double area(){
        return width*height;
    }
}

record OrderItem(String productName, int quantity, double pricePerUnit){
    public double totalPrice(){
        return quantity*pricePerUnit;
    }
}

sealed interface Payment permits Cash, Card{}

record Cash() implements Payment {

}

record Card (String number) implements Payment {

}