package lv.rvt;

public class HealthStation {
    public double weigh(Person person){
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
}
