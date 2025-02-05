package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyManager;

    public ProductWarehouseWithHistory(String productname, double capacity, double initialBalance) {
        super(productname, capacity);
        super.addToWarehouse(initialBalance);
        this.historyManager = new ChangeHistory();
        historyManager.add(initialBalance);
    }
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        historyManager.add(super.getBalance());
    }
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        historyManager.add(super.getBalance());
        return amount;
    }
    public void printAnalysis(){
        System.out.printf("Product: %s\nHistory: %s\nLargest amount: %.1f\nSmallest amount: %.1f\nAverage: %.1f",
                super.getName(),
                historyManager.toString(),
                historyManager.maxValue(),
                historyManager.minValue(),
                historyManager.average());
    }

    public String history(){
        return historyManager.toString();
    }
}
