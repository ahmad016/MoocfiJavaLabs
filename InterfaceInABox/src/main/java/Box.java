import java.util.ArrayList;

public class Box implements Packable{
    private double maximumCapacity;
    private ArrayList<Packable> packable;

    public Box (double maximumCapacity){
        this.maximumCapacity = maximumCapacity;

        this.packable = new ArrayList<>();
    }

    public void add(Packable item){
        if (item.weight() <= maximumCapacity){
            maximumCapacity -= item.weight();

            packable.add(item);
        }
    }

    public String toString(){

        return "Box: " + packable.size() + " items, total weight " + weight() + " kg";
    }

    public double weight(){
        double weight = 0;

        for (Packable total : packable){
            weight += total.weight();
        }

        return weight;
    }

    
}
