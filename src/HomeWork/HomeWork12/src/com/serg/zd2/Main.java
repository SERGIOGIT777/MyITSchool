package HomeWork.HomeWork12.src.com.serg.zd2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3,6);
        shapes[1] = new Rectangle(3,4,6,7);

        for (Shape shape : shapes) {
            shape.draw();
        }
    System.out.println(shapes[0].equals(shapes[1]));
    }
}
