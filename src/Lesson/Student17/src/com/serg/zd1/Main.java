package Lesson.Student17.src.com.serg.zd1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	//Set and HashSet

        HashSet<String> country = new HashSet<>();
        country.add("Paris");
        country.add("London");
        country.add("Moskov");
        country.add("Minsk");

        country.add("Afrika");

        System.out.println(country);

        //удаление элементов из коллекции

        country.remove("Minsk");

        System.out.println(country);

        //определение наличия элемента в коллекции

        System.out.println("List contains Minsk or not " + country.contains("Minsk"));
    }
}
