package lv.rvt;
import java.util.ArrayList;
import java.util.Objects;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> elements;
    private double weight;
    public Box(double capacity) {
        this.capacity = capacity;
        this.elements = new ArrayList<Packable>();
    }
    public void add(Packable packable) {
        if(capacity < packable.weight()){
            System.out.println("Box is full!");
        }else{
            elements.add(packable);
            weight();
        }
    }
    @Override
    public double weight() {
        double weight = 0;
        for(Packable packable : elements){
            weight += packable.weight();
        }
        return weight;
    }
    @Override
    public String toString() {
        return "Box: " + elements.size() + " items, total weight: " + weight();
    }
}
