package Lesson.Student29.src.com.serg.zd5;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        /*LocalTime fiveThirty = LocalTime.of(5, 30);
        LocalTime noon = LocalTime.of(12, 0, 0);
        LocalTime almostMidnight = LocalTime.of(23, 59, 59, 9999999);
        System.out.println(fiveThirty);
        System.out.println(noon);
        System.out.println(almostMidnight);

         */
      /*  LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanosecond = now.getNano();

        System.out.println("Часы: " + hour);
        System.out.println("Минуты: " + minute);
        System.out.println("Секунды: " + second);
        System.out.println("Наносекунды: " + nanosecond);



        int hourAMPM = now.get(ChronoField.HOUR_OF_AMPM); // 0 - 11
        int hourDay = now.get(ChronoField.HOUR_OF_DAY); // 0 - 23
        int minuteDay = now.get(ChronoField.MINUTE_OF_DAY); // 0 - 1,439
        int minuteHour = now.get(ChronoField.MINUTE_OF_HOUR); // 0 - 59
        int secondDay = now.get(ChronoField.SECOND_OF_DAY); // 0 - 86,399
        int secondMinute = now.get(ChronoField.SECOND_OF_MINUTE);// 0 - 59
        long nanoDay = now.getLong(ChronoField.NANO_OF_DAY);//0-86399999999
        int nanoSecond = now.get(ChronoField.NANO_OF_SECOND);//0-999999999

        System.out.println("Часы: " + hourAMPM);
        System.out.println("Часы: " + hourDay);
        System.out.println("Минуты дня: " + minuteDay);
        System.out.println("Минуты: " + minuteHour);
        System.out.println("Секунды дня: " + secondDay);
        System.out.println("Секунды: " + secondMinute);
        System.out.println("Наносекунды дня: " + nanoDay);
        System.out.println("Наносекунды: " + nanoSecond);

       */

       /* LocalTime fiveThirty = LocalTime.of(5, 30);
        LocalTime noon = LocalTime.of(12, 0, 0);
        LocalTime almostMidnight = LocalTime.of(23, 59, 59, 999999);

        System.out.println("fiveThirty.isAfter(noon)? " + fiveThirty.isAfter(noon)); // false
        System.out.println("fiveThirty.isBefore(noon)? " + fiveThirty.isBefore(noon)); // true
        System.out.println("noon.equals(almostMidnight)? " + noon.equals(almostMidnight)); // false

        */

      /*  LocalTime noon = LocalTime.of(12, 0, 0);

        LocalTime ten = noon.with(ChronoField.HOUR_OF_DAY, 10);
        LocalTime eight = noon.withHour(8);
        LocalTime twelveThirty = noon.withMinute(30);
        LocalTime thirtyTwoSeconds = noon.withSecond(32);

        // Можно использовать сцепление методов
        LocalTime secondsNano = noon.withSecond(20).withNano(999999);

        System.out.println("ten: " + ten);
        System.out.println("eight: " + eight);
        System.out.println("twelveThirty: " + twelveThirty);
        System.out.println("thirtyTwoSeconds: " + thirtyTwoSeconds);
        System.out.println("secondsNano: " + secondsNano);

       */

        LocalTime fiveThirty = LocalTime.of(5, 30);
        // Добавление
        LocalTime sixThirty = fiveThirty.plusHours(1);
        LocalTime fiveForty = fiveThirty.plusMinutes(10);
        LocalTime plusSeconds = fiveThirty.plusSeconds(14);
        LocalTime plusNanos = fiveThirty.plusNanos(99999999);
        LocalTime sevenThirty = fiveThirty.plus(2, ChronoUnit.HOURS);

        // Вычитание
        LocalTime fourThirty = fiveThirty.minusHours(1);
        LocalTime fiveTen = fiveThirty.minusMinutes(20);
        LocalTime minusSeconds = fiveThirty.minusSeconds(2);
        LocalTime minusNanos = fiveThirty.minusNanos(1);
        LocalTime fiveTwenty = fiveThirty.minus(10, ChronoUnit.MINUTES);

        System.out.println("sixThirty: " + sixThirty);
        System.out.println("fiveForty: " + fiveForty);
        System.out.println("plusSeconds: " + plusSeconds);
        System.out.println("plusNanos: " + plusNanos);
        System.out.println("sevenThirty: " + sevenThirty);

        System.out.println("fourThirty: " + fourThirty);
        System.out.println("fiveTen: " + fiveTen);
        System.out.println("minusSeconds: " + minusSeconds);
        System.out.println("minusNanos: " + minusNanos);
        System.out.println("fiveTwenty: " + fiveTwenty);
    }
}
