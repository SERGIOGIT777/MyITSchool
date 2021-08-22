package Lesson.Student10.src.com.serg;

public class Car {
    private String model;
    private String color;

    Car () {
        this("Model Default");
    }

    Car(String model) {
        this("Color default", model);
    }

    Car(String color, String model) {
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("Вы не можете изменить модель");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.println("Car - Run...");
    }

    public void stop() {
        System.out.println("Car - Stop...");
    }

    public void info() {
        System.out.println("Car Model: " + model + ", Car color: " +color);
    }

}
