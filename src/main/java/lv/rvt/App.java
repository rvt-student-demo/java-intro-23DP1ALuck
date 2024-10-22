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

            if (number == -1){
                break;
            }
            else{
                numbers.add(number);
            }
    }   
    
        while(true){
            System.out.println("From where?");
            int begin = scanner.nextInt();
            System.out.println("To where?");
            int finish = scanner.nextInt();

            if (begin < 0 || finish > (numbers.size() - 1)){
                System.out.println("Incorrect value");
                continue;
            } 
            else{
                for(int i = begin; i < (finish + 1); i++){
                    System.out.println(numbers.get(i));
                }
            break;
            }
        }
    }
}    
   

