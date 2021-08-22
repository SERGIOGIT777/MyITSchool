package Lesson.Student14.src.com.serg.zd3;

public class Main {

    public static void main(String[] args) {

        /*Account <String> acc1 = new Account<String>("2334", 5000); // id - число
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account <Integer> acc2 = new Account<Integer>(2345, 5000);    // id - строка
        System.out.println(acc2.getId());
*/
        Accountable<String> acc1 = new Account1("1235rwr", 5000);
        //Account1 acc2 = new Account1("2373", 4300);
        Accountable<String> acc2 = new Account2<>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

