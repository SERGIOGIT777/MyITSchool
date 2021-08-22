package HomeWork.HomeWork29.src.com.serg.zd4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate dateLoc = LocalDate.of(1988, 7, 10);
        System.out.println("День рождения - " + dateLoc.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")));
        LocalDate nowLoc = LocalDate.now();
        Period dateP = Period.between(dateLoc, nowLoc);
        int day = dateP.getDays();
        int mounth = dateP.getMonths();
        int year = dateP.getYears();
        int day1;
        int mounth1;

        if (10+day>31) day1 = day*(-1);
        else day1 = day;

        if (7+mounth>12) mounth1 = mounth*(-1);
        else mounth1 = mounth;
        
        LocalDate dateNew = LocalDate.of(1988+year+1, 7+mounth1, 10+day1);

        if(dateNew.isEqual(nowLoc)){
            System.out.println("Даты сравнялись");
            System.out.println("Было добавлено " + day + " дней " + mounth + " месяцев " + year + " лет");
        }

        System.out.println(dateNew);
        System.out.println(nowLoc);
    }
}
