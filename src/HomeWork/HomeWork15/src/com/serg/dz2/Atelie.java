package HomeWork.HomeWork15.src.com.serg.dz2;

public class Atelie{
    public void manDressing(Dress[] dress) {
        System.out.println("Мужская одежда (в наличии):");
        for (Dress dresses : dress) {
            if (dresses instanceof ManDress) {
                System.out.println(dresses);
            }
        }
    }

    public void womanDressing(Dress[] dress) {
        System.out.println("Женская одежда (в наличии):");
        for (Dress dresses : dress) {
            if (dresses instanceof WomanDress) {
                System.out.println(dresses);
            }
        }
    }
}
