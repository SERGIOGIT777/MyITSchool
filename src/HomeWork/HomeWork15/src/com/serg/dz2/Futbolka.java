package HomeWork.HomeWork15.src.com.serg.dz2;

public class Futbolka extends Dress implements ManDress, WomanDress{

    public Futbolka(Size size, String color, double cost){
        super(size, color, cost);
    }

    public Futbolka(Size size, String color){
        super(size, color);
    }

    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " руб." +
                ", цвет = " + getColor() +
                "}";
    }
}
