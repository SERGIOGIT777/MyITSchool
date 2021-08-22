package Lesson.Student30.src.com.serg.zd3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
       /* Period period5y4m3d = Period.of(5, 4, 3);
        Period period2d = Period.ofDays(2);
        Period period2m = Period.ofMonths(2);
        Period period14d = Period.ofWeeks(2);
        Period period2y = Period.ofYears(2);

        System.out.println(period5y4m3d);
        System.out.println(period2d);
        System.out.println(period2m);
        System.out.println(period14d);
        System.out.println(period2y);*/

        //Разница между двумя LocalDate

       /* LocalDate march2003 = LocalDate.of(2003, 3, 1);
        LocalDate may2003 = LocalDate.of(2003, 5, 1);
        Period dif = Period.between(march2003, may2003); //разница
        System.out.println(dif); */

        /*Period period5y4m3d = Period.of(5, 4, 3);
        int days = period5y4m3d.getDays();
        int months = period5y4m3d.getMonths();
        int year = period5y4m3d.getYears();
        long days2 = period5y4m3d.get(ChronoUnit.DAYS);

        System.out.println("Дни: " + days);
        System.out.println("Месяца: " + months);
        System.out.println("Годы: " + year);
        System.out.println("Дни: " + days2);*/

       /* Period period2d = Period.ofDays(2);
        Period period8d = period2d.withDays(8);
        Period period2y1m2d = period2d.withYears(2).withMonths(1);

        System.out.println(period2d);
        System.out.println(period8d);
        System.out.println(period2y1m2d);*/

        Period period5y4m3d = Period.of(5, 4, 3);
        Period period2y = Period.ofYears(2);
        // Добавление
        System.out.println(period5y4m3d.plusYears(4));
        System.out.println(period5y4m3d.plusMonths(3));
        System.out.println(period5y4m3d.plusDays(3));
        System.out.println(period5y4m3d.plus(period2y));

        // Вычитание
        System.out.println(period5y4m3d.minusYears(2));
        System.out.println(period5y4m3d.minusMonths(1));
        System.out.println(period5y4m3d.minusDays(1));
        System.out.println(period5y4m3d.minus(period2y));

    }
}
