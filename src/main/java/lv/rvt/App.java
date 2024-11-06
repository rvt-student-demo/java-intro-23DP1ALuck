package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class App{
    public static void main(String[] args) {

        // Part 1 and part 2
        Statistics statistics = new Statistics();
        Statistics statiscitsOdd = new Statistics();
        Statistics statisticsEven = new Statistics();
        // statistics.addNumber(3);
        // statistics.addNumber(5);
        // statistics.addNumber(1);
        // statistics.addNumber(2);

        // System.out.println("Count: " + statistics.getCount());
        // System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());

        //Part 3 and part 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        while(true){
            int input = scanner.nextInt();
            if (input == -1){
                break;
            }
            else if(input % 2 == 0){
                statisticsEven.addNumber(input);
                statistics.addNumber(input);
            }
            else if(input % 2 != 0){
                statiscitsOdd.addNumber(input);
                statistics.addNumber(input);
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statiscitsOdd.sum());
    }    
}

