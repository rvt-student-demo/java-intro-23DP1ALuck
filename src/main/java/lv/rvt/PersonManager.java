package lv.rvt;
import java.io.BufferedReader;
import java.util.ArrayList;
public class PersonManager {
    public static ArrayList<Person> getPersonlist()throws Exception{
        ArrayList<Person> persons = new ArrayList<>();
        // Person person = new Person("Maija");
        BufferedReader reader = Helper.getReader("person.csv");
        String line;
        reader.readLine();
        while((line = reader.readLine()) != null){
            String[] parts = line.split(", ");
            Person person1 = new Person(parts[0], Integer.valueOf(parts[1]), Double.valueOf(parts[2]), Double.valueOf(parts[3]));

            persons.add(person1);

        }
        return persons;
    }
}
