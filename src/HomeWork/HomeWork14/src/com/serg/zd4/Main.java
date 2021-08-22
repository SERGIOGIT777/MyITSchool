package HomeWork.HomeWork14.src.com.serg.zd4;

public class Main {

    public static void main(String[] args) {
        Human child1 = new Human("Питер", true, 6);
        Human child2 = new Human("Том", true, 5);
        Human child3 = new Human("Лиза", false, 4);
        Human father = new Human("Джон", true, 35, child1, child2, child3);
        Human mother = new Human("Сара", false, 29, child1, child2, child3);
        Human grandfather1 = new Human("Валентина", true, 65, mother);
        Human grandfather2 = new Human("Саймон", true, 68, father);
        Human grandmother1 = new Human("Лидия", false, 60, mother);
        Human grandmother2 = new Human("Коран", false, 59, father);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
    }
}
