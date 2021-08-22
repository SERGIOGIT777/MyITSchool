package HomeWork.HomeWork14.src.com.serg.zd1;

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();
    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        printCats();
    }

    public static void printCats(){
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(i + 1 + " " + cats.get(i));
        }
    }
}
