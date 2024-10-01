package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number){
        for(int i = 1; i<=number; i++){
            System.out.println(i);
        }
    }
}
