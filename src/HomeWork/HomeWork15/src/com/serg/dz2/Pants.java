package HomeWork.HomeWork15.src.com.serg.dz2;

public class Pants extends Dress implements ManDress, WomanDress{
    public Pants(Size size, String color, double cost){
        super(size, color, cost);
    }

    public Pants(Size size, String color){
        super(size, color);
    }

    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " руб." +
                ", цвет = " + getColor() +
                "}";
    }

}
