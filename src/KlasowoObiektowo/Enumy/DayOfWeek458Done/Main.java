package KlasowoObiektowo.Enumy.DayOfWeek458Done;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.TUESDAY;
        System.out.println(today);

        DayOfWeek firstDay = DayOfWeek.MONDAY;
        System.out.println(firstDay.getValue());

        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }

        DayOfWeek day = DayOfWeek.SATURDAY;
        switch (day) {
            case SATURDAY, SUNDAY:
                System.out.println("To jest weekend");
            default:
                System.out.println("Dzien roboczy");
        }

        LocalDate localDate = LocalDate.of(2026,1,6);
        DayOfWeek day2 = localDate.getDayOfWeek();

        DayOfWeek today2 = DayOfWeek.FRIDAY;
        System.out.println(today2);
        System.out.println(today2.plus(1));
        System.out.println(today2.plus(3));
        System.out.println(today2.minus(1));

    }
    public boolean isWeekend (DayOfWeek day){
        return day==DayOfWeek.SATURDAY || day== DayOfWeek.SUNDAY;
    }

    public boolean isWorkingDay(DayOfWeek day){
        return day.getValue() <= 5;
    }
}
