package Lesson.Student24.src.com.serg.zd4;

public class Main {
    public static void main(String[] args) {
        CommonObject commonObject = new CommonObject();
        for(int i = 1; i < 6; i++){
            Thread t;
            t = new Thread(new CounterThread(commonObject));
            t.setName("Поток " + i);
            t.start();
        }
    }
}
