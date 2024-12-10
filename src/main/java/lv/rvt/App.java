package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String name = scanner.nextLine();
            switch (name) {
                case "show":
                ArrayList<Person> persons = PersonManager.getPersonlist();
                System.out.println(" ------------------------------------------------------");
                System.out.printf("|  %10s  |  %3s  |  %6s  |  %6s  |  %5s  |\n", "name", "age", "weight", "height", "BMI");
                System.out.println(" ------------------------------------------------------");
                    for (Person person : persons){
                        System.out.println(person);
                    }System.out.println(" ------------------------------------------------------");
                    break;
                
                case "add":
                    System.out.print("Ievadiet vārdu: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Ievadiet vecumu: ");
                    int age = Integer.valueOf(scanner.nextLine());
                    System.out.print("Ievadiet svaru: ");
                    double weight = Double.valueOf(scanner.nextLine());
                    System.out.print("Ievadiet augumu: ");
                    double height = Double.valueOf(scanner.nextLine());
                    Person person = new Person(name1, age, weight, height);
        
                    PersonManager.addPerson(person);
            
                    System.out.println("Done!");
                    break;
                case "help":
                    System.out.println("Choose option: ");
                    System.out.println("show - show people");
                    System.out.println("add - add person to person\'s list");
                    System.out.println("show - show commands");
                    System.out.println("exit - finish a programm");
                    break;
                case "exit":
                    System.out.println("Programm is finished succesfully!");
                    System.exit(0);
                default:
                    System.out.println("Incorrect option");
                    break;
            }
        }
        

    }
}