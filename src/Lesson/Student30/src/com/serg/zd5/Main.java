package Lesson.Student30.src.com.serg.zd5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US);
        System.out.println(formatter);
         */

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM d, yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse("июня 5, 2018 12:10:56", formatter1);
        System.out.println(localDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate localDate = LocalDate.parse("июня 5, 2018", formatter2);
        System.out.println(localDate);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US);
        System.out.println(dateTime.format(formatter));
    }
}
