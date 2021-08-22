package HomeWork.HomeWork10.src.com.serg;

public class Main {

    public static void main(String[] args) {
	    Veterinar veterinary = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Суп и кости", "Двор частного дома", "Жучка");
        animals[1] = new Cat("Молоко и рыба", "Квартира", "черного");
        animals[2] = new Horse("Сено", "Конюшня", 34.4);

        for (Animal animal : animals) {
            veterinary.treatAnimal(animal);
        }
    }
}
