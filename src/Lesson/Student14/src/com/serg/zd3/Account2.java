package Lesson.Student14.src.com.serg.zd3;

public class Account2<T> implements Accountable<T>{
    private T id;
    private int sum;

    Account2(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}