package Lesson.Student14.src.com.serg.zd7;

public class Driver implements Cloneable{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Driver clone() throws CloneNotSupportedException {
        return (Driver) super.clone();
    }

    public String toString(){
        return "Водитель " + name + " возрвст " + age;
    }
}
