package Lesson.Student14.src.com.serg.zd5;

public class Human implements Cloneable{
    private String name;
    private int age;

    Human(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void display(){
        System.out.printf("Person %s \n", name);
    }

    public Human clone() throws CloneNotSupportedException{
        return (Human) super.clone();
    }
}
