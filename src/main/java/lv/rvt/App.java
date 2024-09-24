package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift: ");
        double value = Integer.valueOf(scanner.nextLine());

        if(value < 5000){
            System.out.println("No tax!");
        }
        else if (value >= 5000 && value < 25000){
            value = (double) (100 + (value-5000) * 0.08);
            System.out.println("Tax: " + value);
        }
        else if (value >= 25000 && value < 55000){
            value = (double) (1700 + (value-25000) * 0.1);
            System.out.println("Tax: " + value);
        }
        else if (value >= 55000 && value < 200000){
            value = (double) (4700 + (value-55000) * 0.12);
            System.out.println("Tax: " + value);
        }
        else if (value >= 200000 && value < 1000000){
            value = (double) (22100 + (value-200000) * 0.15);
            System.out.println("Tax: " + value);
        }
        else if (value >= 1000000){
            value = (double) (1700 + (value-1000000) * 0.17);
            System.out.println("Tax: " + value);
        }

        // and -> &&
        // or -> ||
        // not -> !

      
        
    }
}