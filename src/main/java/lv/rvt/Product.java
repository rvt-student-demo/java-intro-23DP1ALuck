package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String location;
    private int weight;

    public Product(String initialName, double initialPrice, int initialQuantity, String location, int weight){
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.weight = weight;
        this.location = location;
    }
    public Product(String name){
        this(name, 0.0, 0, "shelf", 1);
    }
    public Product(String name, String location){
        this(name, 0.0, 0, location, 1);
    }
    public Product(String name, int weight){
        this(name, 0.0, 0, "shelf", weight);
    }
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
    @Override
    public String toString(){
        return name + " (" + weight + "kg)" + " can be found from the " + location; 
    }
}
