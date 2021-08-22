package Lesson.Student12.src.com.serg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Person def = new Person();
        def.displayInfo();

        Person tom = new Person("Tom");
        tom.displayInfo();

        Person nik = new Person("Nik", 19);
        nik.displayInfo();

         */

        /*Person1 tom = new Person1("Tom", "querty");
        tom.dispalayPerson();
        tom.account.displayAccount();

         */

        /*Human tom = new Human("Tom");
        tom.setAccount("querty");

         */

        /*Math.Factorial fact = Math.getFactorial(5);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());

         */
        /*Employ sam = new Employ("Sam", "AlfaBank");
        sam.display();
        Client tom = new Client("Tom", "AlfaBank");
        tom.display();

         */
       /* Person3 tom = new Person3("Tom");
        tom.display();
        Person3 sam = new Employee("Sam", "Oracle");
        sam.display();
        Person3 bob = new Clients("Bob", "DeutscheBank", 3000);
        bob.display();

        */
        /*
        Object tom = new Person3("Tom");
        Object sam = new Employee("Sam", "Oracle");
        Object kate = new Clients("Kate", "DeutscheBank", 2000);

        //нисходящее преобразование

       /* Employee emp = (Employee)sam;
        emp.display();
        System.out.print(emp.getCompany());
        ((Person3)kate).display();
        */
/*
        Object boss = new Clients("Kate", "DeutscheBank", 2000);

        if(boss instanceof Employee) {
            ((Employee)boss).display();
        } else {
            System.out.println("Conversion is invalid");
        }

 */

        System.out.println("Vvedite katety: ");
        Scanner k = new Scanner(System.in);
        double a = k.nextDouble();
        double b = k.nextDouble();
        Triangle tr = new Triangle(a,b);
        System.out.println("Gipotenuza ravna: " + tr.gip());
        System.out.println("Sinus raven: "+tr.ugol());
        System.out.println("Perimetr raven: "+  tr.perimetr());
        System.out.println("Plowad ravna: "+tr.plowad());
    }
}
