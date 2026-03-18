package KlasowoObiektowo.Enumy.Month616Done;
import java.time.LocalDate;
import java.time.Month;
public class Main {
    public static void main(String[] args) {
        Month month = Month.FEBRUARY;
        System.out.println(month);
        Month month1 = Month.MARCH;
        System.out.println(month1.getValue());
        for(Month m:Month.values()){
            System.out.println(m+" -> "+m.getValue());
        }
        Month month2 = Month.NOVEMBER;
        System.out.println(month2.plus(1));
        System.out.println(month2.plus(2));
        System.out.println(month2.minus(3));

        Month february = Month.FEBRUARY;
        System.out.println(february.minLength());
        System.out.println(february.maxLength());

        LocalDate date = LocalDate.of(2026,3,15);
        Month month3 = date.getMonth();
        Month month4 = Month.valueOf("AUGUST");
        Month month5 = Month.DECEMBER;

        switch(month5){
            case DECEMBER, JANUARY, FEBRUARY:
                System.out.println("Zima");
            case MARCH, APRIL, MAY:
                System.out.println("Wiosna");
            case JUNE, JULY, AUGUST:
                System.out.println("Lato");
            case SEPTEMBER,OCTOBER,NOVEMBER:
                System.out.println("Jesień");
        }
    }


    public int getQuarter(Month month){
        return (month.getValue()-1)/3 + 1;
    }
    public boolean isHighSeason(Month month){
        return month==Month.JANUARY || month==Month.FEBRUARY;
    }


}
