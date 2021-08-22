package HomeWork.HomeWork17.src.com.serg.zd3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    Pet pet1 = new Cat("Сиамский кот",12);
	    Pet pet2 = new Dog("Собака овчарка", 14);
	    Pet pet3 = new Parrot("Попугай какаду", 5);

        HashMap<String, Pet> animal = new HashMap<>();
        animal.put("Муся", pet1);
        animal.put("Шарик", pet2);
        animal.put("Кеша", pet3);

        for (Map.Entry coll: animal.entrySet()){
            System.out.println(coll);
        }

        System.out.println("\nИмена животных");

        ArrayList<String> name = new ArrayList<>(animal.keySet());
        System.out.println(name);

        System.out.println("\nЖивотные");

        ArrayList<Pet> zoo = new ArrayList<>(animal.values());
        System.out.println(zoo);
    }
}
