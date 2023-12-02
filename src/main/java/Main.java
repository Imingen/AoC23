package main.java;
import java.io.IOException;
import java.util.ArrayList;

import main.java.solvers.Two;
import main.java.solvers.one;

public class Main {
    
    final static String DAY = "2";
    final static String FIRST = "1";
    final static String SECOND = "2";
    final static boolean DEBUG = false;
    
    public static void main(String[] args) throws IOException {

        System.out.println("Hello");
        System.out.println("Today is day: " + DAY);
        
        var taskReader = new TaskReader();
        ArrayList<String> taskInput = taskReader.readTask(FIRST, DAY, DEBUG);

        switch (DAY) {
            case "1":
                var dayone = new one();
                var resultDayOne = dayone.SolveFirst(taskInput);
                System.out.println("Day one task one: " + resultDayOne);
                var res2 = dayone.SolveSecond(taskInput);
                System.out.println("Day one task two:" + res2);

            case "2":
                var dayTwo = new Two();
                dayTwo.SolveFirst(taskInput);
                dayTwo.SolveSecond(taskInput);
            
            default:
                break;
        }
    }
}