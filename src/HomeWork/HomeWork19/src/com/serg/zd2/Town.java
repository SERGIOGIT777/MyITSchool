package HomeWork.HomeWork19.src.com.serg.zd2;

public class Town {
    private String postCode = "224000";
    class Street{
        private String town;
        private int house;
        private String streets;

        public void printAddress() {
            System.out.println("Город " + town);
            System.out.println("Индекс " + postCode);
            System.out.println("Улица " + streets);
            System.out.println("Дом " + house);
        }
    }

    public void createStreet() {
        Street street = new Street();
        street.town = "Минск";
        street.house = 78;
        street.streets = "Ленина";
        street.printAddress();
    }
}
