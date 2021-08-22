package Lesson.Student19.src.com.serg.zd1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Collections.Sort()
        List<String> unsort = new ArrayList<>();
        unsort.add("DDD");
        unsort.add("111");
        unsort.add("aaa");
        unsort.add("222");
        unsort.add("CCC");
        unsort.add("ddd");
        unsort.add("444");
        unsort.add("AAA");
        unsort.add("333");

        System.out.println("ArrayList before sorted: ");

        for(String sorted:unsort){
            System.out.println(sorted);
        }

        Collections.sort(unsort);

        System.out.println("ArrayList after sort: ");

        for(String sortedd1: unsort){
            System.out.println(sortedd1);
        }
    }
}
