package Lesson.Student29.src.com.serg.zd4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);
      //  LocalDate newYear2002 = LocalDate.of(2002, Month.JANUARY, 1);

        /*LocalDate today = LocalDate.now();

        System.out.println(newYear2001);
        System.out.println(newYear2002);
        System.out.println(today);

        int year1 = today.get(ChronoField.YEAR);
        int mounth2 = today.get(ChronoField.MONTH_OF_YEAR);

        int year = today.getYear();
        int mounth = today.getMonthValue();
        Month monthAsEnum = today.getMonth();
        int dayYear = today.getDayOfYear();
        int dayMonth = today.getDayOfMonth();
        DayOfWeek dayofWeak = today.getDayOfWeek();

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + mounth);
        System.out.println("Название месяца: " + monthAsEnum);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayofWeak);
        System.out.println("YEAR " + year1);
        System.out.println("MOUNTH " + mounth2);
         */

       /* boolean after = newYear2001.isAfter(newYear2002);
        boolean before = newYear2001.isBefore(newYear2002);
        boolean equal = newYear2001.equals(newYear2002);
        boolean leapyear = newYear2001.isLeapYear();

        System.out.println("2001 after 2002 ? - " + after);
        System.out.println("2001 before 2002 ? - " + before);
        System.out.println("2001 equals 2002 ? - " + equal);
        System.out.println("2001 leapYear 2002 ? - " + leapyear);*/

       /* LocalDate newYear2003 = newYear2001.with(ChronoField.YEAR, 2003);
        LocalDate newYear2004 = newYear2001.withYear(2004);
        LocalDate december2001 = newYear2001.withMonth(12);
        LocalDate february2001 = newYear2001.withDayOfMonth(28);
        LocalDate xmas2001 = newYear2001.withMonth(12).withDayOfMonth(25);

        System.out.println("newYear2003 - " + newYear2003);
        System.out.println("newYear2004 - " + newYear2004);
        System.out.println("december2001 - " + december2001);
        System.out.println("february2001 - " + february2001);
        System.out.println("xmas2001 - " + xmas2001);*/

        LocalDate newYear2005 = newYear2001.plusYears(4);
        LocalDate march2001 = newYear2001.plusMonths(2);
        LocalDate january15Year2001 = newYear2001.plusDays(14);
        LocalDate lastWeakJanuary2001 = newYear2001.plusWeeks(3);
        LocalDate newYear2006 = newYear2001.plus(5, ChronoUnit.YEARS);

        System.out.println("newYear2005 "+ newYear2005);
        System.out.println("march2001 " + march2001);
        System.out.println("january15Year2001 " + january15Year2001);
        System.out.println("lastWeakJanuary2001 " + lastWeakJanuary2001);
        System.out.println("newYear2006 " + newYear2006);
    }
}
