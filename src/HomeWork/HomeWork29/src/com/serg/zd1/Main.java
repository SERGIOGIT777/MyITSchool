package HomeWork.HomeWork29.src.com.serg.zd1;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate dateLoc = LocalDate.of(1988, Month.JULY, 10);
        System.out.println("День рождения - " + dateLoc);
        LocalDate nowLoc = LocalDate.now();
        System.out.println("Текущая дата после дня рождения - " + dateLoc.isAfter(nowLoc));
        System.out.println("Текущая дата перед днем рождения - " + dateLoc.isBefore(nowLoc));
    }
}
