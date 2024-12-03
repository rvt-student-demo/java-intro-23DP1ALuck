package lv.rvt;
import java.util.Locale;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String initialName, int age, double weight, double height){
        this.name = initialName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Person(String name){
        this.name = name;
    }

    public void growOlder(){
        if (this.age < 30){
            this.age++;
        }
    }
    public int returnAge() {
        return this.age;
    } 
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    
    public String getName(){
        return this.name;
    }
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    public String toCsvRow(Person person){
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height; 
    }
    @Override
    public String toString() {
        return String.format(Locale.US,"Name: %s, Age: %d, Weight: %.2f, Height: %.2f", this.name, this.age, this.weight, this.height);
    }
}

