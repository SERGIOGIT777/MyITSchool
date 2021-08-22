package HomeWork.HomeWork14.src.com.serg.zd3;

public class Human {
    private String name;
    private String surname;
    private int age;
    private String address;
    private int phone;
    private String car;

    public Human(String name)
    {
        this.name = name;
    }

    public Human(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human(String name, String surname, int age, String address)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Human(String name, String surname, int age, String address, int phone)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public Human(String name, String surname, int age, String address, int phone, String car)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.car = car;
    }

    public Human(String surname, int age)
    {
        this.surname = surname;
        this.age = age;
    }

    public Human(String surname, int age, String address)
    {
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Human(String surname, int age, String address, int phone)
    {
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public Human(String surname, int age, String address, int phone, String car)
    {
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.car = car;
    }

    public String toString(){
        return "Человек по имени " + name + " фамилией " + surname + " возрастом " + age +
                " живущим в городе " + address + " с номером телефона " + phone + " ездит на машине " + car;
    }
}
