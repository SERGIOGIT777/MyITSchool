package HomeWork.HomeWork10.src.com.serg;

public class Horse extends Animal{
    private double weight;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String makeNoise() {
        return "Иго-го-го-го!!!";
    }

    public String toString() {
        return "Лошадь " +
                "питается '" + getFood() + '\'' +
                ", живет '" + getLocation() + '\'' +
                ", весит = " + weight +
                ' ';
    }
}
