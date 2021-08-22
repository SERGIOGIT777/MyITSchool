package Lesson.Student14.src.com.serg.zd7;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Audi", new Driver("Tom", 18));
        Car clonecar = car.clone();
        System.out.println("Оригинальный автомобиль: \t" + car);
        System.out.println("Клон: \t" + clonecar);

        Driver cloneCarDriver = clonecar.getDriver();
        cloneCarDriver.setName("Bob");

        System.out.println("оРИГИНАЛЬНЫЙ АВТОМООБИЛЬ ПОСЛЕ ИЗМЕНЕНИЯ ПОЛЯ NAME: \t" + car);
        System.out.println("КЛОНИРОВАННЫЙ АВТОМООБИЛЬ ПОСЛЕ ИЗМЕНЕНИЯ ПОЛЯ NAME: \t" + clonecar);

    }
}
