package Lesson.Student13.src.com.serg;

public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void dance(){
        System.out.println(toString() + " я танцую как все остальные");
    }

    @Override
    public String toString(){
        return "Я " + name + ", мне " + age + " лет.";
    }
}
