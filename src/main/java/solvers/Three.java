package solvers;

import java.util.ArrayList;

public class Three {
    

    public void SolveFirst(ArrayList<String> input){

        var sum = 0;
        for(int i = 0; i < input.size(); i++){
            var currentLine = input.get(i);
            for(int j = 0; j < currentLine.length(); j++){
                if(Character.isDigit(currentLine.charAt(j)) || String.valueOf(currentLine.charAt(j)) == ".")
                    continue;

                //Else, check adjacancy
                //If first line, only check below
                if(i == 0){
                    continue;
                    // var below = String.valueOf(input.get(i+1).charAt(j));
                    // var belowPrev = String.valueOf(input.get(i+1).charAt(j-1));
                    // var belowPost = String.valueOf(input.get(i+1).charAt(j+1));

                }
                else if(i == input.size()){
                    continue;
                    // var above = String.valueOf(input.get(i-1).charAt(j));
                    // var abovePrev = String.valueOf(input.get(i-1).charAt(j-1));
                    // var abovePost = String.valueOf(input.get(i-1).charAt(j+1));
                }
                else{
                    if(j == currentLine.length()){
                        var prev = input.get(i).charAt(j-1);
                        if(Character.isDigit(prev)){
                            var k = "";
                            for(int x = j-1; x == 0; x--){
                                if(Character.isDigit(currentLine.charAt(x))){
                                    k = String.valueOf(currentLine.charAt(x) + k);
                                }else{
                                    break;
                                }
                            }
                            sum += Integer.parseInt(k);
                        }
                        var above = input.get(i-1).charAt(j);
                        if(Character.isDigit(above)){
                            var k = "";
                            for(int x = j; x == 0; x--){
                                if(Character.isDigit(input.get(i-1).charAt(x))){
                                    k = String.valueOf(input.get(i-1).charAt(x) + k);
                                }
                            }
                            sum += Integer.parseInt(k);
                        }
                        var abovePrev = String.valueOf(input.get(i-1).charAt(j-1));
                        var below = String.valueOf(input.get(i+1).charAt(j));
                        var belowPrev = String.valueOf(input.get(i+1).charAt(j-1));
                    }else if(j == 0){
                        var next = String.valueOf(input.get(i).charAt(j+1));
                        var above = String.valueOf(input.get(i-1).charAt(j));
                        var abovePost = String.valueOf(input.get(i-1).charAt(j+1));
                        var below = String.valueOf(input.get(i+1).charAt(j));
                        var belowPost = String.valueOf(input.get(i+1).charAt(j+1));

                    }else{
                        var prev = String.valueOf(input.get(i).charAt(j-1));
                        var next = String.valueOf(input.get(i).charAt(j+1));
                        var above = String.valueOf(input.get(i-1).charAt(j));
                        var abovePrev = String.valueOf(input.get(i-1).charAt(j-1));
                        var abovePost = String.valueOf(input.get(i-1).charAt(j+1));
                        var below = String.valueOf(input.get(i+1).charAt(j));
                        var belowPrev = String.valueOf(input.get(i+1).charAt(j-1));
                        var belowPost = String.valueOf(input.get(i+1).charAt(j+1));
                    }

                }

                }
            }
        }

    }

