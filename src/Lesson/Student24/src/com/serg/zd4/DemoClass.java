package Lesson.Student24.src.com.serg.zd4;

public class DemoClass {
    public synchronized static void demoMethod(){
        //
    }
}

class DemoClassTwo{
    public void demoMethod(){
        synchronized (DemoClassTwo.class){
            //
        }
    }
}
