package HomeWork.HomeWork12.src.com.serg.zd2;

import java.awt.*;

public class Circle extends Shape{
    private int xCoord;
    private int yCoord;

    public Circle(){
        super();
    }

    public Circle(int xCoord, int yCoord){
        super();
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public Circle(Color color, int xCoord, int yCoord) {
        super(color);
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public void draw(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (xCoord != circle.xCoord) return false;
        return yCoord == circle.yCoord;
    }

    @Override
    public String toString() {
        return "Круг{" +
                "цвет = " + getColor() +
                ", xCoord =" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }

}
