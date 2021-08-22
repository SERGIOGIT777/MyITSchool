package HomeWork.HomeWork13.src.com.serg.zd4;

public class Truba implements Instrument{
    private int diametr;

    public Truba(int diametr){
        this.diametr = diametr;
    }

    public int getDiametr(){
        return diametr;
    }

    public void setDiametr(int diametr){
        this.diametr = diametr;
    }

    public void play(String KEY) {
        System.out.println(KEY + " играет на трубе диаметром " + getDiametr() + " см");
    }
}
