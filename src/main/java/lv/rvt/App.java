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
            if (number > 0){
                numbers.add(number);
            }
        }
        
        int sum = 0;
        for(int x = 0; x < numbers.size(); x++){
            sum += numbers.get(x);
        }
        System.out.println(sum);
    }    
}
    
   

