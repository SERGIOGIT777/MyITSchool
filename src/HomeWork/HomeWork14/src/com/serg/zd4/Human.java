package HomeWork.HomeWork14.src.com.serg.zd4;

import java.util.ArrayList;

public class Human {
    private String name;
    private boolean sex;
    private int age;
    private ArrayList<Human> children = new ArrayList<>();

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human child1) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.add(child1);
    }

    public Human(String name, boolean sex, int age, Human child1, Human child2, Human child3){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children.add(child1);
        this.children.add(child2);
        this.children.add(child3);
    }

    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Имя: ").append(this.name);
        text.append(", пол: ").append(this.sex ? "мужской" : "женский");
        text.append(", возраст: ").append(this.age);

        int childCount = this.children.size();
        if (childCount > 0) {
            text.append(", дети: ").append(this.children.get(0).toString());

            for (int i = 1; i < childCount; i++) {
                Human child = this.children.get(i);
                text.append(", ").append(child.name);
            }
        }
        return text.toString();
    }

}
