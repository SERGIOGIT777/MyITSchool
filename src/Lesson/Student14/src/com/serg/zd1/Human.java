package Lesson.Student14.src.com.serg.zd1;

public class Human implements Swing{
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public void swing() {
        System.out.println(toString() + " Я плаваю плохо ");
    }
    @Override
    public String toString() {
        return "Меня зовут " + name + ", мне " + age + " лет";
    }
}
