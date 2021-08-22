package Lesson.Student17.src.com.serg.zd2;

import Lesson.Student17.src.com.serg.zd4.Pocupatel;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Double> magazin = new HashMap<>();
        //magazin.put(12.5, "Колбаса");
        //magazin.put(16.7, "Сосиски");
        //magazin.put(18.9, "Хлеб");
        magazin.put("Хлеб", 18.9);


        ArrayList<String> pocup = new ArrayList<>(magazin.keySet());
        System.out.println(pocup);
    }
}
