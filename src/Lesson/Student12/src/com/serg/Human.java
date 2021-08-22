package Lesson.Student12.src.com.serg;

public class Human {
    private String name;

    Human(String name) {
        this.name = name;
    }

    public void setAccount(String password) {

        class Account {
            void display() {
                System.out.printf("Account Login : %s \t Password : %s \n", name, name);
            }
        }
        Account account = new Account();
        account.display();
    }
}
