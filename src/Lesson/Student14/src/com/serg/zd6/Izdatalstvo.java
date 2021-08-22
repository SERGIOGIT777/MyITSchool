package Lesson.Student14.src.com.serg.zd6;

public class Izdatalstvo implements Cloneable{
    private String name;

    public Izdatalstvo(String name) {
        this.name = name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName(){
        return name;
    }

    public Izdatalstvo clone() throws CloneNotSupportedException {
        return (Izdatalstvo) super.clone();
    }
}
