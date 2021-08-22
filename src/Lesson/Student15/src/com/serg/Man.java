package Lesson.Student15.src.com.serg;

public class Man {
    private WorkDay workDay;
    private boolean gotoWork;

    public void wakeup(){
        if (this.workDay.getDaywork() == Day.SATURDAY || this.workDay.getDaywork() == Day.SUNDAY){
            System.out.println("Вам не надо идти сегодня на работу!!!");
        } else
        {
            System.out.println("Пора на работу!");
        }
    }
}
