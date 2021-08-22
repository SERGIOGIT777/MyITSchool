package Lesson.Student14.src.com.serg.zd4;

public class Main {

    public static void main(String[] args) {
        /*Printer printer = new Printer();
        String [] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer [] number = {23, 4, 5, 2, 13, 456, 4};
        printer.<String>print(people);
        printer.<Integer>print(number);*/

        /*Account<String, Double> acc = new Account<String, Double>("354", 5000.87);
        String id = acc.getId();
        Double sum = acc.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);*/

        Account1 acc1 = new Account1("cid2373", 5000);
        Account1 acc2 = new Account1(53757, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

