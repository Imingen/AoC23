package main.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TaskReader {

    public ArrayList readTask(String task, String day, boolean debug) throws IOException {
        String filename = day + "_" + task + ".txt";
        System.out.println("Reading values from: " + filename);
        String path = "inputs/" + filename;

        ArrayList input = new ArrayList();
        String currentLine = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        while((currentLine = bufferedReader.readLine()) != null){
            input.add(currentLine);
            if(debug)
               System.out.println(currentLine);        }

        return input;
    }


}
