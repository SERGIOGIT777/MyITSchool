package HomeWork.HomeWork12.src.com.serg.zd3;

public class Tovar {
    private String name;
    private double price;
    private int rating;

    public Tovar(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void info() {
        System.out.println("Товар -> " + name + " Рейтинг -> " + rating + " цена -> " + price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;

        Tovar product = (Tovar) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (rating != product.rating) return false;
        return name.equals(product.name);
    }

    @Override
    public String toString() {
        return "Товар{" +
                "название: '" + name + '\'' +
                ", цена: " + price +
                ", рэйтинг: " + rating +
                '}';
    }

}
