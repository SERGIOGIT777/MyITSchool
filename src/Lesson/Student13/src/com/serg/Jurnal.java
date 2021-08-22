package Lesson.Student13.src.com.serg;

public class Jurnal implements Printable{
    private String name;

    String getName(){
        return name;
    }

    Jurnal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }

}
