package Lesson.Student12.src.com.serg;

public class Triangle {
    private double a;
    private double b;

    Triangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double gip(){ return Math.sqrt(a*a+b*b);}

    public double ugol(){return Math.sin(a/gip());}

    public double perimetr(){return a+a+gip();}

    public double plowad(){return (a*b)/2;}
}
