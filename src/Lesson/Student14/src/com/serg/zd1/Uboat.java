package Lesson.Student14.src.com.serg.zd1;

public class Uboat implements Swing{
    private int speed;

    public Uboat(int speed) {
        this.speed = speed;
    }

    @Override
    public void swing(){
        System.out.println("Подводная лодка плывет со скоростью " + speed + " узлов");
    }
}
