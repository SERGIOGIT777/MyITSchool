package Lesson.Student16.src.com.serg.zd2;


import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// Интерфейсы Collection Framework

        //ArrayList

        //add

        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Minsk");
        LinkedList<String> myLinked = new LinkedList<>();
        myLinked.add("Brest");

        ArrayList<Animal> myAnimal = new ArrayList<>();

        Cat myCat = new Cat();
        myAnimal.add(myCat);

        //remove - удаление

        myArray.add("Hello");
        /* myArray.remove(1);
        myArray.remove("Hello");
        */

        myArray.add(2, "Pinsk");

        for (String s : myArray) {
            System.out.println(s);
        }

    }
}
