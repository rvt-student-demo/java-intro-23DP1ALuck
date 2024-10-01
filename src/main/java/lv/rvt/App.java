package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        System.out.println("Give numbers: ");

        while(true){
        int number = Integer.valueOf(scanner.nextLine());
        if (number == -1){
            break;
        }
        if(number % 2 == 0){
            even++;
        }
        else{
            odd++;
        }
        sum += number;
        count++;
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double)sum/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}