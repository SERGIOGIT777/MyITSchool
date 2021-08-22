package Lesson.Student24.src.com.serg.zd2;

public class MyClass extends Thread{

    MyClass(){
        //новый поток
        super("Второй поток.");
        System.out.println("Создан второй поток " + this);
        start();
    }

    public void run(){
        System.out.println("Поток запущен!");
        try{
            for(int i=5; i >0; i--){
                System.out.println("Второй поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Второй поток прерван");
        }
    }

    public void onClick(){
        MyClass myThread = new MyClass();
    }


}
