package HomeWork.HomeWork12.src.com.serg.zd3;

import java.util.*;

public class Basket {
    private String name;
    private SortedSet<Tovar> tovarSet;

    public Basket(Comparator<Tovar> comparator) {
        tovarSet = Collections.unmodifiableSortedSet(new TreeSet<>(comparator));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Tovar> getTovarSet() {
        return tovarSet;
    }

    public void setTovarSet(SortedSet<Tovar> tovarSet) {
        this.tovarSet = tovarSet;
    }

    public void addTovar(Tovar tovar) {
        tovarSet.add(tovar);
    }

    public void addTovars(Collection<Tovar> tovars) {
        tovarSet.addAll(tovars);
    }

    public void removeTovar(Tovar tovar) {
        tovarSet.remove(tovar);
    }

    public void removeTovars(Collection<Tovar> tovars) {
        tovarSet.removeAll(tovars);
    }

    @Override
    public String toString() {
        return "Category{" +
                "название: '" + name + '\'' +
                ", товары: " + tovarSet +
                '}';
    }

}
