package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) throws Exception {
        
        String[] names = {"John", "Carl", "Jerry"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to a file\n");
        writer.write("Here is another line.\n");
        for(String name : names){
            writer.write(name+"\n");
        }
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("/Users/t0mmyq./Library/CloudStorage/OneDrive-RīgasValststehnikums/java-intro-23DP1ALuck/src/main/resources/data.csv"));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
