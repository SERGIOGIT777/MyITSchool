package Lesson.Student13.src.com.serg;

public class BaseConventer1 implements Conventer{
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}
