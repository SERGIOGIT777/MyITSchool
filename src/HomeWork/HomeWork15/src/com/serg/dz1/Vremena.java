package HomeWork.HomeWork15.src.com.serg.dz1;

public enum Vremena {
    SPRING(18),
    SUMMER(35){
        @Override
        public void getDescription(){
            System.out.println("Теплое время года");
        }
    },
    AUTUMN(5),
    WINTER(-15);

    private double temperatura;

    Vremena(double temperatura) {
        this.temperatura = temperatura;
    }

    public void getDescription() {
        System.out.println("Холодное время года");
    }

    public String toString() {
        return "{ Температура = " + temperatura + '}';
    }

}
