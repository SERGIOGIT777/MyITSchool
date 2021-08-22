package Lesson.Student14.src.com.serg.zd4;

public class Account1 {
    private String id;
    private int sum;

    <T>Account1(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}
