package Lesson.Student18.src.com.serg.zd2;

public class House implements Comparable<House>{
    int area;
    String cite;
    int price;
    boolean hasFurniture;

    public House(int area, int price,
                 String cite, boolean hasFurniture){
        this.area = area;
        this.price = price;
        this.cite = cite;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString(){
        return "House{" + "area: " + area +
                ", price: " + price +
                ", city: " + cite +
                ", hasFurniture: " + hasFurniture;
    }

    public int compareTo(House anotherHouse){
        return Integer.compare(this.area, anotherHouse.area);
    }
}
