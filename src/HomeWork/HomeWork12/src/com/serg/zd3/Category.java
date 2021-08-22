package HomeWork.HomeWork12.src.com.serg.zd3;

import java.util.*;

public class Category {
    private String name;
    private SortedSet<Tovar> tovarSet;

    public Category(String name, Comparator<Tovar>comparator) {
        this.name = name;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (!name.equals(category.name)) return false;
        return tovarSet != null ? tovarSet.equals(category.tovarSet) : category.tovarSet == null;
    }

    @Override
    public String toString() {
        return "Category{" +
                "название: '" + name + '\'' +
                ", товары: " + tovarSet +
                '}';
    }

}
