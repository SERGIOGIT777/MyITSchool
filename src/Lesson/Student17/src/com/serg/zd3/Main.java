package Lesson.Student17.src.com.serg.zd3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> stroki = new HashMap<>();
        stroki.put(1, "Tom");
        stroki.put(2, "Lara");
        stroki.put(3, "Kira");
        stroki.put(4, "Maik");
        stroki.put(5, "Piter");

        ArrayList<String > znach = new ArrayList<>(stroki.values());
        znach.sort(String::compareTo);
        System.out.println(znach);

        for (Map.Entry coll: stroki.entrySet()){
            System.out.println(coll);
        }

        Set<Integer> strokii = stroki.keySet();
        System.out.println(strokii);
    }
}
