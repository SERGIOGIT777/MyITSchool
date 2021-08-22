package Lesson.Student30.src.com.serg.zd1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
       /* // Секунды и наносекунды равны нулю
        LocalDateTime date1 = LocalDateTime.of(2014, 9, 19, 14, 5);
        // Наносекунды равны нулю
        LocalDateTime date2 = LocalDateTime.of(2014, 9, 19, 14, 5, 20);
        LocalDateTime date3 = LocalDateTime.of(2014, 9, 19, 14, 5, 20, 9);

        LocalDate date = LocalDate.now();
        LocalDateTime date4 = date.atTime(14, 30, 59, 999999);

        LocalTime time = LocalTime.now();
        LocalDateTime date5 = time.atDate(date);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);*/

       /* LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayYear = now.getDayOfYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Год: " + year);
        System.out.println("День в году: " + dayYear);
        System.out.println("Часы: " + hour);
        System.out.println("Минуты: " + minute);*/

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime date1 = now.with(ChronoField.HOUR_OF_DAY, 10);
        LocalDateTime date2 = now.withMonth(8);
        LocalDateTime date3 = now.withYear(2013).withMinute(0);

        System.out.println("Сегодня : " + now);
        System.out.println("1-я дата : " + date1);
        System.out.println("2-я дата : " + date2);
        System.out.println("3-я дата : " + date3);

        // Сравнение
        boolean after = now.isAfter(date1);
        boolean before = now.isBefore(date1);
        boolean equal = now.equals(date1);

        System.out.println("Сравнение : ");
        System.out.println("Now isAfter date1 : " + after);
        System.out.println("Now isBefore date1 : " + before);
        System.out.println("Now equals date1 : " + equal);

        // Добавление
        LocalDateTime date4 = now.plusYears(4);
        LocalDateTime date5 = now.plusWeeks(3);
        LocalDateTime date6 = date1.plus(2, ChronoUnit.HOURS);

        System.out.println("Добавление : ");
        System.out.println("                " + date4);
        System.out.println("                " + date5);
        System.out.println("                " + date6);

        // Вычитание
        LocalDateTime date7 = now.minusMonths(2);
        LocalDateTime date8 = now.minusNanos(1);
        LocalDateTime date9 = now.minus(10, ChronoUnit.SECONDS);

        System.out.println("Вычитание : ");
        System.out.println("                " + date7);
        System.out.println("                " + date8);
        System.out.println("                " + date9);
    }
}
