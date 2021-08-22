package Lesson.Student12.src.com.serg;

public class Person1 {
   private String name;
   Account account;

   Person1(String name, String password) {
       this.name = name;
       account = new Account(password);
   }

   void dispalayPerson() {
       System.out.printf("Name : %s \tPassword : %s", name, account.password);
   }

   public class Account {
       private String password;

       Account(String pass) {
           this.password = pass;
       }
       void displayAccount(){
           System.out.printf("Account Login : %s \t Password : %s \n", Person1.this.name, password);
       }
   }
}
