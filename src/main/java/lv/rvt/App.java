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
        Counter number = new Counter(4);
        number.decrease();
        number.decrease(2);
        number.increase();
        number.increase(6);
        System.out.println(number.value());
}
}
