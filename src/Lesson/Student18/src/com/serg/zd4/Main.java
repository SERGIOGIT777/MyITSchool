package Lesson.Student18.src.com.serg.zd4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*SortedMap<String, Double> treeMap = new TreeMap<>();
        treeMap.put("Tom", 180.5);
        treeMap.put("Alex", 156.6);
        treeMap.put("Ivan", 156.4);

        treeMap.forEach((k, v) -> System.out.println(k + " : " + v));

         */

        Map<Product, String> map = new HashMap<>();

        Product pr1 = new Product(123, "Кукла", "USA");
        Product pr2 = new Product(432, "Машинка", "RUSIAN");
        Product pr3 = new Product(342, "Мишка", "Canada");

        map.put(pr1, "DetMir");
        map.put(pr2, "Kids");
        map.put(pr3, "Kari");

        System.out.println(map.get(pr1));
        System.out.println(map.get(pr2));
        System.out.println(map.get(pr3));

    }
}
