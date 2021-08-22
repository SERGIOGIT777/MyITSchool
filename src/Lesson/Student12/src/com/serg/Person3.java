package Lesson.Student12.src.com.serg;

public class Person3 {
    private String name;

    public String getName() {
        return name;
    }

    public Person3(String name) {
        this.name = name;
    }

    public void display() {
        System.out.printf("Person : %s \n", name);
    }
}

class Employee extends Person3{

    private String company;

    public Employee(String name, String company) {

        super(name);
        this.company = company;
    }
    public String getCompany(){ return company; }

    public void display(){

        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
// класс клиента банка
class Clients extends Person3{

    private int sum; // Переменная для хранения суммы на счете
    private String bank;

    public Clients(String name, String bank, int sum) {

        super(name);
        this.bank=bank;
        this.sum=sum;
    }

    public void display(){

        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSum(){ return sum; }
}
