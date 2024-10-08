package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

public class App{

    public static void printStars(int number){
        
        for(int i = 0; i < number ; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSquare(int size){
        for(int x = 0; x < size; x++){
            printStars(size);
        }
    }
    public static void printRectangle(int width, int height){
        for(int stars = 0; stars < height; stars++){
            printStars(width);
        }
    }
    public static void printTriangle(int size){
        for (int z = 1; z <= size; z++){
            printStars(z);
        }
    }
    public static void printSpaces(int size) {
        for (int space = size; space >= 0; space--){
            System.out.print(" ");
        }
    }
    public static void printTriangleReverse(int size){
        for (int i = 0; i < size; i++){
            printSpaces(size - i);
            printStars(i+1);
        }
    }


    public static void printingChristmasTree(int height){
        for (int i = 1; i < height + 1; i++){
            printSpaces(height-i);
            printStars(2 * i - 1);
        }
        for (int i = 1; i < 3; i++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing stars");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");
        System.out.println("Printing a square");
        printSquare(4);
        System.out.println("");
        System.out.println("Printing a rectangle");
        printRectangle(17, 3);
        System.out.println("");
        System.out.println("Printing a triangle");
        printTriangle(4);
        System.out.println("");
        System.out.println("Printing a reversed triangle");
        printTriangleReverse(4);
        System.out.println("");
        System.out.println("Printing a christmas tree");
        printingChristmasTree(10);
    }
    
}   

