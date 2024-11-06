package lv.rvt;

public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalane){
        this.balance = openingBalane;
    }

    public void eatAffordably() {
        this.balance -= 2.60;
    }
    
    public void eatHeartily() {
        if (this.balance - 4.60 > 0){
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0){
            this.balance += amount;
            if (this.balance + amount > 150){
                this.balance = 150.0;
            }
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
