package HomeWork.HomeWork19.src.com.serg.zd3;

public class Town1 {
    private String postCode = "224000";

    public void createStreet() {
        final int house = 1;
        final int postCode = 1;
        final int street = 1;
        class Street {
            public void printAddress() {
                System.out.println("Индекс " + postCode);
                System.out.println("Улица " + street);
                System.out.println("Дом " + house);
            }
        }
        Street street1 = new Street();
        street1.printAddress();
    }
}
