package lv.rvt;

public class Agent {
    private String firstname;
    private String lastname;
    public Agent(String name, String surname){
        this.firstname = name;
        this.lastname = surname;
    }

    @Override

    public String toString(){
        return "My name is " + this.firstname + ", " + this.firstname + " " + this.lastname;
    }
}
