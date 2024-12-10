package lv.rvt;

public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalane){
        this.balance = openingBalane;
    }

    public double getBalance(){
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }
    public boolean takeMoney(double amount){
        if(getBalance() - amount > 0){
            balance -= amount;
            return true;
        }return false;
    }
}
