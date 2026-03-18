//package WazneKlasy.BuddhistCalendar265$;
//import java.util.Date;
//import java.util.Calendar;
//import java.util.Locale;
//import java.util.TimeZone;
//import java.util.BuddhistCalendar;
//
//public class BuddhistCalendarExample {
//    public static void main(String[] args) {
//        // Tworzymy instancję BuddhistCalendar
//        BuddhistCalendar bc = new BuddhistCalendar();
//
//        // Aktualna data w buddyjskim kalendarzu
//        int day = bc.get(Calendar.DAY_OF_MONTH);
//        int month = bc.get(Calendar.MONTH) + 1; // Miesiące są 0-indeksowane
//        int year = bc.get(Calendar.YEAR);
//
//        System.out.println("Dzisiaj w kalendarzu buddyjskim: " + day + "/" + month + "/" + year);
//
//        // Możemy też ustawić konkretną datę
//        bc.set(2568, Calendar.MAY, 15); // 2568 = 2025 + 543
//
//        Date date = bc.getTime();
//        System.out.println("Data w systemie (konwersja na Date): " + date);
//
//        // Porównanie z kalendarzem gregoriańskim
//        Calendar gc = Calendar.getInstance();
//        System.out.println("Dzisiaj w kalendarzu gregoriańskim: " +
//                gc.get(Calendar.DAY_OF_MONTH) + "/" +
//                (gc.get(Calendar.MONTH) + 1) + "/" +
//                gc.get(Calendar.YEAR));
//    }
//}
