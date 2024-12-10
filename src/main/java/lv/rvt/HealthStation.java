package lv.rvt;

public class HealthStation {
    private int weighningsCounter;
    public double weigh(Person person){
        weighningsCounter++;
        return person.getWeight();
    }
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }
    public int weighings(){
        return weighningsCounter;
    }
}
