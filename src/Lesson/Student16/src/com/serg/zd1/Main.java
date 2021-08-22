package Lesson.Student16.src.com.serg.zd1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// Интерфейсы Comparable и Comparator

        ArrayList<House> myJouse = new ArrayList<>();

        House house1 = new House(30000, 150, "Brest", true);
        House house2 = new House(40000, 200, "Minsk", false);
        House house3 = new House(60000, 300, "Paris", true);

        myJouse.add(house1);
        myJouse.add(house2);
        myJouse.add(house3);

        for(House house: myJouse){
            System.out.println(house);
        }

       ComparatorPrice comap = new ComparatorPrice();

        myJouse.sort(comap);

        System.out.println("Sorted: ");
        for (House h1: myJouse){
            System.out.println(h1);
        }
    }
}
