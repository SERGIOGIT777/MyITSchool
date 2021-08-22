package HomeWork.HomeWork15.src.com.serg.dz2;

public class Main {

    public static void main(String[] args) {
	Dress[] dresess = {
	        new Futbolka(Size.XXS, "черная", 12),
            new Futbolka(Size.XS, "синяя", 16),
            new Futbolka(Size.S, "голубая", 20),
            new Futbolka(Size.M, "красная", 25),
            new Futbolka(Size.L, "бордовая", 12),
            new Skirt(Size.XXS, "черная", 12),
            new Skirt(Size.XS, "синяя", 16),
            new Skirt(Size.S, "голубая", 20),
            new Skirt(Size.M, "красная", 25),
            new Skirt(Size.L, "бордовая", 12),
            new Tie(Size.XXS, "черная", 12),
            new Tie(Size.XS, "синяя", 16),
            new Tie(Size.S, "голубая", 20),
            new Tie(Size.M, "красная", 25),
            new Tie(Size.L, "бордовая", 12),
            new Pants(Size.XXS, "черная", 12),
            new Pants(Size.XS, "синяя", 16),
            new Pants(Size.S, "голубая", 20),
            new Pants(Size.M, "красная", 25),
            new Pants(Size.L, "бордовая", 12),
    };

	Atelie atelie = new Atelie();
	atelie.manDressing(dresess);
	System.out.println();
	atelie.womanDressing(dresess);
    }
}
