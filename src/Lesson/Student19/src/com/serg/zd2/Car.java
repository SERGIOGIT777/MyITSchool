package Lesson.Student19.src.com.serg.zd2;

public class Car {
    private String model;
    private int weight;

    public Car(String model, int weight){
        this.model = model;
        this.weight = weight;
    }

    public void start(){
        System.out.println("Поехали!");
    }

    public class Wheel{
        public void left(){
            System.out.println("Руль влево");
        }
        public void right(){
            System.out.println("Руль вправо");
        }
    }
}
