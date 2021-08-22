package Lesson.Student30.src.com.serg.zd2;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
       /* Instant now = Instant.now();

        Instant instant = now.with(ChronoField.NANO_OF_SECOND, 10);

        // Устанавливаем секунды
        Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);
        // Устанавливаем секунды и наносекунды (могут быть отрицательные)
        Instant sixSecTwoNanBeforeEpoch = Instant.ofEpochSecond(-6, -2);
        // Устанавливаем милисекунды после (могут быть и до) эпохи
        Instant fiftyMilliSecondsAfterEpoch = Instant.ofEpochMilli(50);

        System.out.println("now: " + now);
        System.out.println("instant: " + instant);
        System.out.println("fiveSecondsAfterEpoch: " + fiveSecondsAfterEpoch);
        System.out.println("sixSecTwoNanBeforeEpoch: " + sixSecTwoNanBeforeEpoch);
        System.out.println("fiftyMilliSecondsAfterEpoch: " + fiftyMilliSecondsAfterEpoch);*/

       /* Instant now = Instant.now();

        long Second = now.getEpochSecond(); // Получить секунды
        int nanos1 = now.getNano(); //Получить наносекунды
        // Получить значение как int
        int millis = now.get(ChronoField.MILLI_OF_SECOND);
        // Получить значение как long
        long nanos2 = now.getLong(ChronoField.NANO_OF_SECOND);

        System.out.println("Секунды: " + Second);
        System.out.println("Наносекунды: " + nanos1);
        System.out.println("Милисекунды: " + millis);
        System.out.println("Наносекунды: " + nanos2);*/

       /* Instant now = Instant.now();
        Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);

        System.out.println("now.isAfter(fiveSecondsAfterEpoch)? " + now.isAfter(fiveSecondsAfterEpoch));
        System.out.println("now.isBefore(fiveSecondsAfterEpoch)? " + now.isBefore(fiveSecondsAfterEpoch));
        System.out.println("now.equals(fiveSecondsAfterEpoch)? " + now.equals(fiveSecondsAfterEpoch));
        */

        Instant now = Instant.ofEpochSecond(0);

        System.out.println(now);

        // Добавление

        System.out.println(now.plusSeconds(400));
        System.out.println(now.plusMillis(98622200));
        System.out.println(now.plusNanos(300013890));
        System.out.println(now.plus(2, ChronoUnit.MINUTES));

        // Вычитание

        System.out.println(now.minusSeconds(2));
        System.out.println(now.minusMillis(1));
        System.out.println(now.minusNanos(1));
        System.out.println(now.minus(10, ChronoUnit.SECONDS));

    }
}
