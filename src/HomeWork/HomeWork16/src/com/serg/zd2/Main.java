package HomeWork.HomeWork16.src.com.serg.zd2;

public class Main {

    public static void main(String[] args) {
	Shapochka shapochka = new Shapochka("Красная шапочка");
	Granny granny = new Granny("Бабушка");
	Pirognoe pirognoe = new Pirognoe("Пирожки");
	DrevoMan drevoMan = new DrevoMan("Железный дровосек");
	Wolf wolf = new Wolf("Волк");

	wolf.ate.add(granny);
	wolf.ate.add(shapochka);
	drevoMan.killed.add(wolf);
    }
}
