package Lesson.Student15.src.com.serg;

public class dayjfWeek {

    /*private String title;
    private dayjfWeek(String title){
        this.title = title;
    }

    public static dayjfWeek Monday = new dayjfWeek("Понедельник");
    public static dayjfWeek Thusday = new dayjfWeek("Вторник");
    public static dayjfWeek Wednesday = new dayjfWeek("Среда");
    public static dayjfWeek Thursday = new dayjfWeek("Четверг");
    public static dayjfWeek Friday = new dayjfWeek("Пятница");
    public static dayjfWeek Saturday = new dayjfWeek("Суббота");
    public static dayjfWeek Sunday = new dayjfWeek("Воскресенье");

    @Override
    public String toString(){
        return "dayofWeek = {" + title + "}";    }

     */

    private enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

}
