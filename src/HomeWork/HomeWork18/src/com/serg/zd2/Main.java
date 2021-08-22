package HomeWork.HomeWork18.src.com.serg.zd2;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        SortedMap<String, Cat> map = new TreeMap<>();
        map.put("Cat1", new Cat("Муська"));
        map.put("Cat2", new Cat("Васька"));
        map.put("Cat3", new Cat("Мурка"));
        map.put("Cat4", new Cat("Катя"));
        map.put("Cat5", new Cat("Маша"));
        map.put("Cat6", new Cat("Барсик"));
        map.put("Cat7", new Cat("Кисик"));
        map.put("Cat8", new Cat("Петька"));
        map.put("Cat9", new Cat("Пуся"));
        map.put("Cat10", new Cat("Барс"));

        for (Map.Entry cats: map.entrySet()){
            System.out.println(cats.getKey() + " - " + cats.getValue());
        }
    }
}
