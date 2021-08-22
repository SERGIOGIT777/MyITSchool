package Lesson.Student18.src.com.serg.zd1;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	    //TreeSet
        /*SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Minsk");
        treeSet.add("Pinsk");
        treeSet.add("Brest");
        treeSet.add("Moskov");

        System.out.println(treeSet);

         */

        //SortedSet - интерфейс

        /*SortedSet<String> treeSet = new TreeSet<>();

        treeSet.add("Minsk");
        treeSet.add("Pinsk");
        treeSet.add("Brest");
        treeSet.add("Moskov");
        treeSet.add("London");

        System.out.println(treeSet);

        SortedSet<String> subSet = treeSet.subSet("Brest", "Pinsk");
        System.out.println(subSet);

        System.out.println("HeadSet: " + treeSet.headSet("Brest"));

        System.out.println("TailSet: " + treeSet.tailSet("Pinsk"));

        System.out.println("Последний элемент - " + treeSet.last());

        System.out.println("Первый элемент - " + treeSet.first());
        */

        //NavigableSet

        NavigableSet<Integer> time = new TreeSet<>();

        time.add(1310);
        time.add(1220);
        time.add(1050);
        time.add(2310);
        time.add(1915);

        //java5 - методы

        System.out.println("JAVA 5");

        SortedSet<Integer> subSet = time.headSet(1900);

        System.out.println("Последний поезд перед 19:00 - " + subSet.last());

        SortedSet<Integer> tailSet = time.tailSet(2000);

        System.out.println("Первый поезд после 20:00 - " + tailSet.first());

        //java6

        System.out.println("JAVA 6");

        System.out.println("Последний поезд перед 19:00 - " + time.lower(1900));

        System.out.println("Первый поезд после 20:00 - " + time.higher(2400));


    }
}
