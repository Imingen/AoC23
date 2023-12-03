package solvers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Two {

    static final int BLUE = 14;
    static final int RED = 12;
    static final int GREEN = 13;



    public void SolveFirst(ArrayList<String> input){
        
        var sum = 0;

        for(String elem : input){
            var gameNumber = ParseGameNumber(elem);
            var colorResults = ParseColorsDayOne(elem);

            if(!colorResults)
                continue;
            
            sum += Integer.parseInt(gameNumber);
        }

        System.out.println("Result for solveFirst: " + sum);
    }


    public void SolveSecond(ArrayList<String> input){
        
        var sum = 0;

        for(String elem : input){
            var gameNumber = ParseGameNumber(elem);
            var gameResult = ParseColorsDayTwo(elem);
            System.out.println("Gamresult: " + gameResult);
            sum += gameResult;
        }
        System.out.println("Result for solveSecond: " + sum);
    }

    private String ParseGameNumber(String inputLine){
        int colonIndex = inputLine.indexOf(":");
        String gameNumber = inputLine.substring(4, colonIndex).trim();
        System.out.println("Gamenumber: " + gameNumber);

        return gameNumber;
    }

    private int ParseColorsDayTwo(String inputLine){
        int colonIndex = inputLine.indexOf(":");
        String colorsRaw = inputLine.substring(colonIndex + 1, inputLine.length());
        System.out.println("colorsraw: " + colorsRaw);
        String[] games = colorsRaw.split(";");
       
        int green = 0;
        int blue = 0;
        int red = 0;
       
        for(String game : games){
            String[] gameResults = game.split(",");
            for(String r : gameResults){
                r = r.trim();
                var x = r.split(" ");
                var numColors = Integer.parseInt(x[0]);
                var color = x[1];
                if(color.equals("red") && numColors > red)
                    red = numColors;
                if(color.equals("blue") && numColors > blue)
                    blue = numColors;
                if(color.equals("green") && numColors > green)
                    green = numColors;
                }

            }

            System.out.println("Blue: " + blue);
            System.out.println("Green: " + green);
            System.out.println("Red: " + red);
            if(blue == Integer.MAX_VALUE)
                return green * red;
            if(green == Integer.MAX_VALUE)
                return blue * red;
            if(red == Integer.MAX_VALUE)
                return blue * green;
            return blue * green * red;
        }

    private boolean ParseColorsDayOne(String inputLine){

        int colonIndex = inputLine.indexOf(":");
        String colorsRaw = inputLine.substring(colonIndex + 1, inputLine.length());
        String[] games = colorsRaw.split(";");

        for(String elem : games){
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("red", 0);
            map.put("green", 0);
            map.put("blue", 0);
            String[] gameResults = elem.split(",");
            for(String r : gameResults){
                r = r.trim();
                var x = r.split(" ");
                var numColors = x[0];
                var color = x[1];
                var currentValue = map.get(color);
                map.put(color, currentValue + Integer.parseInt(numColors));
            }

            if(!CalculateMap(map)){
                return false;
            };
        
        }
        return true;
    }

    private boolean CalculateMap(Map<String, Integer> map){
        var redResults = map.get("red");
        var greenResults = map.get("green");
        var blueResults = map.get("blue");

        if(redResults > RED || greenResults > GREEN || blueResults > BLUE){
            return false;
        }
        return true;
    }
    
}
