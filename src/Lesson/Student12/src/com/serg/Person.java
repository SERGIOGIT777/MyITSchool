package Lesson.Student12.src.com.serg;

public class Person {
    String name;
    int age;
// начало блока инициализатора
    {
        name = "Default";
        age = 19;
    }
//конец блока инициализатора

    Person(){

    }

    Person(String name) {
        this(name, 24);
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
