package hw_10.task_1;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        System.out.println("-----(TASK 1) Displaying the current date and time:-----");
        printCurrentDateTime();

        System.out.println("\n-----(TASK 2) Adding and subtracting time-----");
        LocalDateTime sourceDate = LocalDateTime.of(2023, 10, 25, 14, 30);
        System.out.println(calculateFutureDateTime(sourceDate, 3, 5));

        System.out.println("\n-----(TASK 3) Checking the weekend-----");
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0)));
        System.out.println(isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0)));

        System.out.println("\n-----(TASK 4) Date and time formatting-----");
        LocalDateTime dt4 = LocalDateTime.of(2023, 10, 25, 14, 30);
        System.out.println(formatDateTime(dt4, "dd-MM-yyyy HH:mm"));

        System.out.println("\n-----(TASK 5) Difference between dates and times-----");
        LocalDateTime start = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime end = LocalDateTime.of(2023, 10, 28, 16, 45);
        System.out.println(calculateDifference(start, end));
    }

    //TASK 1 (Displaying the current date and time)
    public static void printCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));
    }

    //TASK 2 (Adding and subtracting time)
    public static LocalDateTime calculateFutureDateTime(LocalDateTime sourceDate, int days, int hours) {
        return sourceDate.plusDays(days).plusHours(hours);
    }

    //TASK 3 (Checking the weekend)
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    //TASK 4 (Date and time formatting)
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        return dateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    //TASK 5 (Difference between dates and times)
    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        return "Difference: " + days + " days, " + hours + " hours, " + minutes + " minutes";
    }
}
