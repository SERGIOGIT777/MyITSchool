package HomeWork.HomeWork15.src.com.serg.dz2;

public class Tie extends Dress implements ManDress{
    public Tie(Size size, String color, double cost){
        super(size, color, cost);
    }

    public Tie(Size size, String color){
        super(size, color);
    }

    public String toString() {
        return "Галстук{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " руб." +
                ", цвет = " + getColor() +
                "}";
    }
}
