package HomeWork.HomeWork13.src.com.serg.zd4;

public class Gitar implements Instrument{
    private int struni;
    public Gitar(int struni) {
        this.struni = struni;
    }

    public int getStruni(){
        return struni;
    }

    public void setStruni(int struni) {
        this.struni = struni;
    }

    public void play(String KEY) {
        System.out.println(KEY + " играет на гитаре на " + getStruni() + " струнах");
    }
}
