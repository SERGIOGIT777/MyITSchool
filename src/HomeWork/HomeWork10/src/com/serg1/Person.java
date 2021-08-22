package HomeWork.HomeWork10.src.com.serg1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this("", 0);
    }

    public Person(String fullName) {
        this(fullName, 0);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk() {
        System.out.printf("Hello! My name is %s. I am %d years old.\n", this.fullName, this.age);
    }

    public void move() {
        System.out.printf("Hello! My name is %s. I am %d years old.\n", this.fullName, this.age);
    }
}
