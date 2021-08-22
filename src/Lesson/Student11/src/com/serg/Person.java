package Lesson.Student11.src.com.serg;

public class Person {
    //String name;
    //protected int age;
    //public String address;
    //private String phone;
/*
    private String name;
    private int age;

    //конструктор
   // public Person(String name, int age, String address, String phone){
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        //this.address = address;
        //this.phone = phone;
    }
/*
    //методы

    public void displayName(){ //публичный метод
        System.out.printf("Name: %s \n", name); //%s - стринковый тип, %d - число
    }

    void displayAge(){ //дефолтный метод
        System.out.printf("Age: %d \n", age);
    }

    private void displayAddress(){ //приватный метод
        System.out.printf("Address: %s \n", address);
    }

    protected void displayPhone(){ //защитный метод
        System.out.printf("Phone: %s \n", phone);
    }

 */

    /*
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        //Проверка условия ввода переменной
        if (age > 0 && age < 115) this.age = age;
    }

     */
/*
    private int id;
    private static int counter = 1;


 */
    /*
    //Статический инициализатор
    static {
        counter = 105;
        System.out.println("Static initializer");
    }

     */

 /*   //Конструктор
    Person() {
        id = counter++;
   //     System.out.println("Constructor");
    }

    //СТАТИЧЕСКИЙ МЕТОД!

    public static void displayCounter() {
        System.out.printf("Counter: %d \n", counter);
    }

    //МЕТОД ВЫВОДА
    public void displayID() {
        System.out.printf("ID: %d \n", id);
    }

  */

    private String name;
    Person (String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
