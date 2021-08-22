package Lesson.Student14.src.com.serg.zd1;

public class Fish implements Swing{
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swing(){
        System.out.println("Я рыба " + name + " Я плаваю хорошо");
    }
}
