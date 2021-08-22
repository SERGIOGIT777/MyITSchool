package Lesson.Student12.src.com.serg;

abstract class Person2 {
    private String name;

    public String getName() {
        return name;
    }

    public Person2(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Employ extends Person2{
    private String bank;
    public Employ(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display() {
        System.out.printf("Employ Name : %s \t Bank : %s \n", super.getName(), bank);
    }
}

class Client extends Person2 {
    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }
    public void display(){
        System.out.printf("Client Name : %s \t Bank : %s \n", super.getName(), bank);
    }
}
