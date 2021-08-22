package HomeWork.HomeWork15.src.com.serg.dz1;


public class Main {

    public static void main(String[] args) {
        System.out.print("Любимое время года: ");
        info(Vremena.SUMMER);
	    for(Vremena vremena: Vremena.values()) {
            info(vremena);
        }
    }

    public static void info(Vremena vremena){
        System.out.printf("%s %s, ", vremena.name(), vremena);
        vremena.getDescription();
        switch (vremena){
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case SPRING:
                System.out.println("Лето лучше весны");
                break;
            case WINTER:
                System.out.println("Зима классная когда снег");
                break;
            case AUTUMN:
                System.out.println("Не люблю осень");
                break;
        }
    }
}
