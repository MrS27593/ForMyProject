package KlasowoObiektowo.Enumy.ChronoField769Done;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026,3,15);
        int day = date.get(ChronoField.DAY_OF_MONTH);
        int month = date.get(ChronoField.MONTH_OF_YEAR);
        int year = date.get(ChronoField.YEAR);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        int monthValue = date.getMonthValue();
        System.out.println(monthValue);

        LocalDate date1 = LocalDate.of(2026,3,15);
        date1 = date1.with(ChronoField.DAY_OF_MONTH,1);
        date1 = date1.with(ChronoField.MONTH_OF_YEAR,12);
        System.out.println(date1);

        ValueRange range = ChronoField.DAY_OF_MONTH.range();
        System.out.println(range);
        LocalTime time = LocalTime.of(14,30,45);
        int hour = time.get(ChronoField.HOUR_OF_DAY);
        int minute = time.get(ChronoField.MINUTE_OF_HOUR);
        int second = time.get(ChronoField.SECOND_OF_MINUTE);
        date.isSupported(ChronoField.HOUR_OF_DAY); // false
        time.isSupported(ChronoField.DAY_OF_MONTH); // false
        int dow = date.get(ChronoField.DAY_OF_WEEK);
        DayOfWeek day2 = DayOfWeek.of(dow);

        LocalDateTime dt = LocalDateTime.now();
        dt = dt.with(ChronoField.HOUR_OF_DAY,9);

        dow = date.get(ChronoField.DAY_OF_WEEK);
        boolean isWeekend = dow == 6 || dow ==7;
        System.out.println(isWeekend);
    }
}
