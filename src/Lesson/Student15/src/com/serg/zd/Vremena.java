package Lesson.Student15.src.com.serg.zd;

public enum Vremena {
    SPRING(5),
    SUMMER(40) {
        public void getDescription() {
            System.out.println("Жаркое время года");
        }
    },
    AUTUMN(15),
    WINTER(-10);

    Vremena(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }

    @Override
    public String toString() {
        return "#" + ordinal() + "{" +
                "averageTemperature = " + averageTemperature + "\u00B0C" +
                '}';
    }

    private double averageTemperature;

}
