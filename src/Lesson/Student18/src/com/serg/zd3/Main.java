package Lesson.Student18.src.com.serg.zd3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("Cris", 183.5);
        hashMap.put("Tom", 190.6);
        hashMap.put("Tony", 187.5);

        Set<String> keys = hashMap.keySet();

        for(String ky:keys){
            System.out.println(ky);
            System.out.println(hashMap.get(ky));
        }
    }
}
