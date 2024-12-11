package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        if(payment >= 2.50){
            this.money += 2.50;
            this.affordableMeals += 1;
            return payment - 2.50;
        }else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if(payment >= 4.3){
            this.money += 4.3;
            this.heartyMeals += 1;
            return payment - 4.3;
        }else{
            return payment;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
