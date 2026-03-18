package KlasowoObiektowo.Enumy.ChronoUnit282Done;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026,1,1);
        date = date.plus(5,ChronoUnit.DAYS);
        date = date.minus(1,ChronoUnit.MONTHS);
        System.out.println(date);

        LocalDate start = LocalDate.now();
        LocalDate end = LocalDate.of(start.getYear(),1,31);
        long days = ChronoUnit.DAYS.between(start,end);
        System.out.println(days);

        LocalTime t1 = LocalTime.of(10,10);
        LocalTime t2 = LocalTime.of(12,30);
        long minutes = ChronoUnit.MINUTES.between(t1,t2);

        System.out.println(ChronoUnit.DAYS.isDurationEstimated());
        System.out.println(ChronoUnit.DAYS.isDateBased());

        Duration d = ChronoUnit.HOURS.getDuration();
        System.out.println(d);

        boolean expired = ChronoUnit.DAYS.between(LocalDate.now(), t1) > 0;
    }
}
