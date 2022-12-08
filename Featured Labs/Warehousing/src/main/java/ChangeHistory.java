import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> inventory;

    public ChangeHistory() {
        inventory = new ArrayList<>();
    }

    public void add(double status) {
        inventory.add(status);
    }

    public void clear() {
        inventory.clear();
    }

    public double maxValue() {
        if (inventory.size() <= 0) {
            return 0.0;
        }

        double max = 0.0;
        for (double i : inventory) {
            if (i > max) {
                max = i;
            }
        }

        return max;

    }

    public double minValue() {
        if (inventory.size() <= 0) {
            return 0.0;
        }

        double min = inventory.get(0);

        for (double i : inventory) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    public double average() {
        if (inventory.isEmpty()) {
            return 0.0;
        }

        double average = 0.0;

        for (Double add : inventory) {
            average += add;
        }

        return (double) average / inventory.size();
    }

    public String toString() {
        return inventory.toString();

    }

}
