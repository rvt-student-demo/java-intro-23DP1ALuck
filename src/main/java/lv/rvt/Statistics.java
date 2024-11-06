package lv.rvt;

public class Statistics {
    private int count;
    private int number;
    private int sum;

    public Statistics() {
    }

    public void addNumber(int number) {
        this.number = number;
        count++;
        sum += this.number;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return sum * 1.0 / count; 
    }
}
