package Lesson.Student14.src.com.serg.zd5;


public class Main {

    public static void main(String[] args) {
       /*Human tom = new Human(12, "Tom");
       tom.info();
       Human stiv = tom;
       stiv.setName("Stiv");
       tom.info();*/

        try{
            Human tom = new Human("Stiv", 12);
            Human stiv = tom.clone();
            stiv.setName("Stiv");
            tom.display();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Clonable not implemented");
        }

    }
}
