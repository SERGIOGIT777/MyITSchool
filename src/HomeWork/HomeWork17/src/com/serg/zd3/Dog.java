package HomeWork.HomeWork17.src.com.serg.zd3;

public class Dog extends Pet{
    private String porody;
    private int gody;

    public Dog(String porody, int gody){
        this.porody = porody;
        this.gody = gody;
    }

    @Override
    public String toString(){
        return porody + ", лет - " + gody;
    }
}
