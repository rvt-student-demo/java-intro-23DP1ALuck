package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        for(int x = beginning; x <= end; x++){
            if(x % 3 == 0){
                System.out.println(x);
            }
        }
    }
}
