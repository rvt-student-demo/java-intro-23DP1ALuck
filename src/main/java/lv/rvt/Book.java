package lv.rvt;

public class Book implements Packable{
    private String author;
    private String title;
    private double weight;

    public Book(String author, String title, double weight) {
        this.author = author;
        this.weight = weight;
        this.title = title;
    }

    public double weight(){
        return weight;
    }

    @Override
    public String toString(){
        return author + ": " + title;
    }
}
