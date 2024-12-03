package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Person> persons = PersonManager.getPersonlist();

        for (Person person : persons){
            System.out.println(person);
        }
        
    }
}