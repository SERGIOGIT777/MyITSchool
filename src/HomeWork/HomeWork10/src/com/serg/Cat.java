package HomeWork.HomeWork10.src.com.serg;

public class Cat extends Animal{
    private String color;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, String color) {
        this(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест.");
    }

    @Override
    public String makeNoise() {
        return "Мя-я-я-я-я-я-у!!!!";
    }

    public String toString() {
        return "Кошка " + color +
                " цвета, питается ='" + getFood() + '\'' +
                ", живет = '" + getLocation() + '\'' +
                ' ';
    }
}
