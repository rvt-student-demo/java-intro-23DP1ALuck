package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class App{
    public static void main(String[] args) throws Exception{
        Timer timer = new Timer();
        while (true) {
            System.out.println(timer);
            timer.advance();
        
            try {
                Thread.sleep(10);
            } catch (Exception e) {
        
            }
    }
}
}
