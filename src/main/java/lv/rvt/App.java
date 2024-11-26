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
        BufferedReader reader = Helper.getReader("person.csv");

        reader.readLine();

        String row1 = reader.readLine();
        System.out.println(row1);
    }
}