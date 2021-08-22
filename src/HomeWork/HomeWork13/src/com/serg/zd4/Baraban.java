package HomeWork.HomeWork13.src.com.serg.zd4;

public class Baraban implements Instrument{
    private int size;

    public Baraban(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void play(String KEY) {
        System.out.println(KEY + " играет на барабане размером " + getSize() + " дюймов");
    }
}
