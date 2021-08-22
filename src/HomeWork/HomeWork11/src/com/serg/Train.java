package HomeWork.HomeWork11.src.com.serg;

import java.util.Comparator;

public class Train {
    private String name;
    private int numberTrain;
    private double timeTrain;

    public Train(String name, int numberTrain, double timeTrain) {
        this.name = name;
        this.numberTrain = numberTrain;
        this.timeTrain = timeTrain;
    }
    public void info() {
        System.out.println(name + " -> " + numberTrain + " : " + timeTrain);
    }

    public static class ByNumberComparator implements Comparator< Train > {
        @Override
        public int compare(Train left, Train right) {
            return left.numberTrain - right.numberTrain;
        }
    }
}
