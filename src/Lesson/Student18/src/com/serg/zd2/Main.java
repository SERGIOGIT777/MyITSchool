package Lesson.Student18.src.com.serg.zd2;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<House> myHouseList = new TreeSet<>();

        House firstHouse = new House(150, 15000, "Brest", true);
        House secondHouse = new House(80, 8000, "Pinsk", false);
        House thirdHouse = new House(250, 45000, "Minsk", true);

        myHouseList.add(firstHouse);
        myHouseList.add(secondHouse);
        myHouseList.add(thirdHouse);

        for(House home: myHouseList){
            System.out.println(home);
        }
    }
}
