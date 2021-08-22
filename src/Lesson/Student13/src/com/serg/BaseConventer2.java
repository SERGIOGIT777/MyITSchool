package Lesson.Student13.src.com.serg;

public class BaseConventer2 implements Conventer{
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}
