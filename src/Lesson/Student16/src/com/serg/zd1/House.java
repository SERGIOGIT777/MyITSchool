package Lesson.Student16.src.com.serg.zd1;

public class House implements Comparable<House>{
    int price;
    int area;
    String city;
    boolean hasFurniture;

    public House(int price, int area, String city, boolean hasFurniture){
        this.price = price;
        this.area = area;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString(){
        final String s = "House{" + "area = " + area +
                ", city : " + city +
                ", price : " + price + '\'' +
                ", hasFurniture : " + hasFurniture +
                "}";
        return s;
    }

    public int compareTo(House anotherHouse) {
        return Integer.compare(this.area, anotherHouse.area);
    }
    }
