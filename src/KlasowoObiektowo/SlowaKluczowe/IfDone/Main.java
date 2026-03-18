package KlasowoObiektowo.SlowaKluczowe.IfDone;

public class Main {
    public static void main(String[] args) {
        boolean warunek=true;
        if(warunek){

        }
        int x = 5;
        if(x>10){
            System.out.println("Większe niż 10");
        }else {
            System.out.println("Mniejsze lub równe 10");
        }

        int score = 85;
        if(score >=90){
            System.out.println("A");
        } else if (score >=75) {
            System.out.println("B");
        } else if (score>=50) {
            System.out.println("C");
        }else {
            System.out.println("F");
        }

        if (x>0) System.out.println("Dodatnia liczba");

         x = 5;
        int y = 10;

        if(x>0){
            if(y>5){
                System.out.println("x>0 i y>5");
            }
        }

        x = 5;
        y = 10;

        if(x>0 && y>0){
            System.out.println("Obie liczby są dodatnie");
        }

        if(x>0 || y<0){
            System.out.println("Przynajmniej jeden warunek jest prawdziwy");
        }

        if(!(x<0)){
            System.out.println("x nie jest ujemne");
        }

        int quantity = 15;

        if(quantity>=100){
            System.out.println("Duże zamówienie - rabat 10%");
        } else if (quantity>=50) {
            System.out.println("Średnie zamówienie - rabat 5%");
        }else {
            System.out.println("Małe zamówienie - brak rabatu");
        }

        String day = "Monday";
        if(day.equals("Monday")||day.equals("Tuesday")){

        }
    }
}
