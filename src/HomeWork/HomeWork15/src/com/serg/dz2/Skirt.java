package HomeWork.HomeWork15.src.com.serg.dz2;

public class Skirt extends Dress implements WomanDress{
    public Skirt(Size size, String color, double cost){
        super(size, color, cost);
    }

    public Skirt(Size size, String color){
        super(size, color);
    }

    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " руб." +
                ", цвет = " + getColor() +
                "}";
    }
}
