package HomeWork.HomeWork10.src.com.serg;

public class Dog extends Animal{
    private String name;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String name) {
        this(food, location);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String makeNoise() {
        return "Гав-гав-гав!!!";
    }


    public String toString() {
        return "Собака " + name +
                " питается = '" + getFood() + '\'' +
                ", живет = '" + getLocation() + '\'' +
                ' ';
    }

}
