package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    Box(double side){
        this.width = side;
        this.height = side;
        this.length = side;
    }
    Box(Box oldbox){
        this.width = oldbox.width;
        this.height = oldbox.height;
        this.length = oldbox.length;
    }

    public Box biggerBox(Box oldBox){
        return new Box(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * length);
    }

    public Box smallerBox(Box oldBox){
        return new Box(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * length);
    }

    private double faceArea(){
        return width * height;
    }

    private double topArea(){
        return length * width;
    }

    private double sideArea(){
        return length * height;
    }

    public double volume(){
        return width * height * length;
    }

    double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
    }

    public double width(){
        return width;
    }
    public double height(){
        return height;
    }
    public double length(){
        return length;
    }

    public boolean nests(Box outsideBox){
        if(this.width < outsideBox.width &&
        this.height < outsideBox.height &&
        this.length < outsideBox.length){
            return true;
        }return false;
    }
}
