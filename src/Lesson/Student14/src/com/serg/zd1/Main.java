package Lesson.Student14.src.com.serg.zd1;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Button button = new Button(new ButtonClick());
        button.click();
        button.click();
        button.click();*/

        /*Button tvButton = new Button(new ButtonClick(){

            private boolean on = false;
            public void execute(){

                if(on) {
                    System.out.println("Телевизор выключен..");
                    on=false;
                }
                else {
                    System.out.println("Телевизор включен!");
                    on=true;
                }
            }
        });

        Button printButton = new Button(new ButtonClick(){

            public void execute(){

                System.out.println("Запущена печать на принтере...");
            }
        });


        tvButton.click();
        printButton.click();
        tvButton.click();*/

        Swing human = new Human(14, "Tom");
        Swing fish = new Fish("Pepi");
        Swing uboaut = new Uboat(12);

        List<Swing> swimers = Arrays.asList(human, fish, uboaut);
        for (Swing s: swimers) {
            s.swing();
        }
    }
}
