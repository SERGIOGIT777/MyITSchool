package HomeWork.HomeWork10.src.com.serg1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя персоны - ");
        String name = sc.nextLine();
        System.out.print("\nСколько лет персоне - ");
        int ag = sc.nextInt();
        Person person1 = new Person();
        person1.setFullName(name);
        person1.setAge(ag);
        System.out.println();
        person1.talk();
        person1.move();
        Person person2 = new Person("Чак", 15);
        person2.move();
        person2.talk();
    }
}
