package HomeWork.HomeWork15.src.com.serg.dz2;

public enum Size {
    XXS(32){
        @Override
        public void getDescription() {
            System.out.println("Детский размер");
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    public void getDescription() {
        System.out.println("Взрослый размер");
    }

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String toString() {
        return this.name() + " (" + euroSize + " размер)";
    }
}
