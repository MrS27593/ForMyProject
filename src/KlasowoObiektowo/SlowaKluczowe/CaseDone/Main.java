package KlasowoObiektowo.SlowaKluczowe.CaseDone;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        switch (a){
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        };

        int dzien = 3;
        switch (a){
            case 1:
                System.out.println("poniedziałek");
            case 2:
                System.out.println("wtorek");
            case 3:
                System.out.println("środa");
            default:
                System.out.println("Dzień nieznany");
        };

        int number = 1;
        switch (number){
            case 1:
                System.out.println("Jeden");
            case 2:
                System.out.println("Dwa");
            case 3:
                System.out.println("Trzy");
        }

        String kolor = "blue";
        switch (kolor){
            case "red":
                System.out.println("Czerwony");
                break;
            case "green":
                System.out.println("Zielony");
            default:
                System.out.println("Inny kolor");
        }

        Day day = Day.Tuesday;
        switch (day){
            case Monday:
                System.out.println("Poniedziałek");
                break;
            case Tuesday:
                System.out.println("Wtorek");
                break;
            case Wednesday:
                System.out.println("Środa");
                break;

        }
        String whichday ="";
        int dayy = 2;
        whichday = switch (dayy){
            case 1-> "Poniedziałek";
            case 2-> "Wtorek";
            case 3-> "Środa";
            default -> throw new IllegalStateException("Unexpected value: " + dayy);
        };

        String month = "Lipiec";
        int daysInMonth = switch (month){
            case "Styczeń" -> 31;
            case "Luty" -> 28;
            case "Marzec" -> 31;
            case "Kwiecień" -> 30;
            case "Maj" -> 31;
            case "Czerwiec" -> 30;
            case "Lipiec" -> 31;
            case "Sierpień" -> 31;
            case "Wrzesień" -> 30;
            case "Październik" -> 31;
            case "Listopad" -> 30;
            case "Grudzień" -> 31;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
        System.out.println(daysInMonth);

    }
}

enum Day{
    Monday, Tuesday, Wednesday
}
