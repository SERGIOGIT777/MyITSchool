package HomeWork.HomeWork17.src.com.serg.zd3;

public class Parrot extends Pet {
    private String porody;
    private int gody;

    public Parrot(String porody, int gody){
        this.porody = porody;
        this.gody = gody;
    }

    @Override
    public String toString(){
        return porody + ", лет - " + gody;
    }
}
