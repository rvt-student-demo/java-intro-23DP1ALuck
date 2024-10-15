package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class App{

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            int number = scanner.nextInt();
            if (number == 0){
                break;
            }
            numbers.add(number);
        }
        System.out.println(numbers.get(1)+numbers.get(2));
    
    }    
}
    
   

