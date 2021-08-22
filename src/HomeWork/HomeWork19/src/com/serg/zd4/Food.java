package HomeWork.HomeWork19.src.com.serg.zd4;

public class Food {
    public static void main(String[] args) {
        Apple apple = new Apple(){
            public void washApple(){
                System.out.println("Помыть яблоко");
            }
            @Override
            public void thisApple(){
                System.out.println("Это фрукт – яблоко");
                washApple();
            }
        };
        apple.thisApple();
    }
}
