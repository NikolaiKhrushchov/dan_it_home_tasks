package hw_7.task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {
    private final List<T> comrades;

    public Warehouse() {
        this.comrades = new ArrayList<>();
    }

    public void addItem(T product) {
        comrades.add(product);
    }

    public int getItemCount() {
        return comrades.size();
    }

    public List<T> retrieveAll() {
        List<T> allComrades = new ArrayList<>(comrades);
        comrades.clear();
        return allComrades;
    }

    public List<T> viewItems() {
        return new ArrayList<>(comrades);
    }

    public boolean isEmpty() {
        return comrades.isEmpty();
    }

    public void clear() {
        comrades.clear();
    }
}
