package HomeWork.HomeWork19.src.com.serg.zd1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(-34);
        list.add(12);

        Collections.sort(list);
        System.out.println(list);

        list.sort((o1, o2) -> {
            int a = o1;
            int b = o2;
            //return a < b ? 1 : a == b ? 0 : -1; ---- STREAM API
            return Integer.compare(b, a);
        });
        System.out.println(list);
    }
}
