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
    public boolean isOfLegalAge() {
        return this.age >= 18;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getHeight(){
        return this.height;
    }
    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }
    public String toCsvRow(){
        return this.name + ", " + this.age + ", " + this.weight + ", " + this.height; 
    }
    @Override
    public String toString() {
        return String.format(Locale.US,"|  %10s  |  %3d  |  %6.2f  |  %6.2f  |  %5.2f  |", getName(), getAge(), getWeight(), getHeight(), bodyMassIndex());
    }
}

