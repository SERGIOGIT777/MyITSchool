package HomeWork.HomeWork13.src.com.serg.zd2;

public class EURO implements Conventer{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue / 3.65;
    }
    private double val;

    public double getValue(){
        return val;
    }

    public void setValue(double val) {
        this.val = val;
    }
}
