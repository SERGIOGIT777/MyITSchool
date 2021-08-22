package Lesson.Student14.src.com.serg.zd4;

public class Printer {
    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
