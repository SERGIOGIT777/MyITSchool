package Lesson.Student16.src.com.serg.zd1;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<House> {
    public int compare(House h1, House h2){
        return Integer.compare(h1.price, h2.price);
    }

}
