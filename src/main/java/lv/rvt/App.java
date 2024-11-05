package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class App{
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        DecreasingCounter counter2 = new DecreasingCounter(2);
        DecreasingCounter counter3 = new DecreasingCounter(100);

        // part 1
        System.out.println("Part 1");

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();


        // part 2
        System.out.println("Part 2");
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        // part 3
        System.out.println("Part 3");
        counter3.printValue();

        counter3.reset();
        counter3.printValue();

        counter3.decrement();
        counter3.printValue();


   }    
}

