package Lesson.Student13.src.com.serg;

public class BreakDancer extends Dancer{
    public BreakDancer(String name, int age) {
        super(name, age);
    }
    //переопределение метода базового класса
    @Override
    public void dance(){
        System.out.println(toString() + " Я танцую в стиле брейк-данс");
    }
}
