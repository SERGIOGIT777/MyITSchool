package HomeWork.HomeWork17.src.com.serg.zd1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karl", "Mayik", "Karl", "Bob", "Sem", "Bob", "Mayik");
        System.out.println("Коллекция объектов: " + names);
        Set<String> duplicates = removeDuplicates(names);
        System.out.println("Коллекция дубликатов: " + duplicates);
    }

    public static <T> Set<T> removeDuplicates(Collection<T> collection) {
       Set<T> element = new HashSet<>();
       return collection.stream().filter(e -> !element.add(e)).collect(Collectors.toSet());
    }
}
