package HomeWork.HomeWork15.src.com.serg.dz2;

abstract class Dress {
    private Size size;
    private String color;
    private double cost;

    public Dress(){

    }

    public Dress(Size size, String color){
        this.color = color;
        this.size = size;
    }

    public Dress(Size size, String color, double cost){
        this.color = color;
        this.size = size;
        this.cost = cost;
    }

    public Size getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public void setSize(Size size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public  void setCost(double cost){
        this.cost = cost;
    }
}
