package Lesson.Student12.src.com.serg;

abstract class Figure {

    //координаты
    float x;
    float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //метод для получения периметра

    public abstract float getPerimetr();

    //метод для получения площади

    public abstract float getArea();

}

//класс для получения прямоугольника

class Rect extends Figure {
    private float wedth;
    private float height;

    //конструктор который обращается к конструктору класса Figure

    Rect(float x, float y, float wedth, float height) {
        super(x,y);
        this.wedth = wedth;
        this.height = height;
    }

    public float getPerimetr() {
        return height * 2 + wedth * 2;
    }

    public float getArea() {
        return  wedth * height;
    }
}
