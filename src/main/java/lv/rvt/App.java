package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int digit1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int digit2 = Integer.valueOf(scanner.nextLine());
        
        if (digit1 > digit2) {
            System.out.println("Greater number is: " + digit1);
        } else if (digit2 > digit1){
            System.out.println("Greater number is: " + digit2);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}