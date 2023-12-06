package solvers;

import java.util.ArrayList;

public class Three {
    

    public void SolveFirst(ArrayList<String> input){

        var sum = 0;
        System.out.println("SIZE IS: " + input.size());
        for(int i = 0; i < input.size(); i++){
            var currentLine = input.get(i);
            for(int j = 0; j < currentLine.length(); j++){
                if(!Character.isDigit(currentLine.charAt(j)) || String.valueOf(currentLine.charAt(j)).trim().equals("."))
                    continue;

                //Else, check adjacancy
                //If first line, only check below
                if(i == 0){
                    continue;
                    // var below = String.valueOf(input.get(i+1).charAt(j));
                    // var belowPrev = String.valueOf(input.get(i+1).charAt(j-1));
                    // var belowPost = String.valueOf(input.get(i+1).charAt(j+1));

                }
                else if(i >= input.size()-1){
                    continue;
                    // var above = String.valueOf(input.get(i-1).charAt(j));
                    // var abovePrev = String.valueOf(input.get(i-1).charAt(j-1));
                    // var abovePost = String.valueOf(input.get(i-1).charAt(j+1));
                }
                else{
                    var firstNumberIndex = j;
                    var lastNumberIndex = j;
                    while(Character.isDigit(currentLine.charAt(lastNumberIndex))){
                        if(lastNumberIndex == currentLine.length() - 1)
                            break;
                        lastNumberIndex += 1;
                    }
                    var fullNumber = currentLine.substring(firstNumberIndex, lastNumberIndex);
                    System.out.println(fullNumber);
                    System.out.println(i);
                    for(int h = firstNumberIndex; h <= lastNumberIndex; h++){
                        var above = String.valueOf(input.get(i - 1).charAt(h)).trim();
                        if(!above.equals(".") && !Character.isDigit(above.toCharArray()[0])){
                            sum += Integer.parseInt(fullNumber);
                            break;
                        }
                        if(h != 0){
                            var abovePrev = String.valueOf(input.get(i-1).charAt(h-1));
                            if(!abovePrev.equals(".") && !Character.isDigit(above.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }
                        if(h < input.size() - 1){
                            var aboveNext = String.valueOf(input.get(i-1).charAt(h));
                            if(!aboveNext.equals(".") && !Character.isDigit(aboveNext.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }

                        if(h < input.size()-1){
                            var below = String.valueOf(input.get(i+1).charAt(h));
                            if(!below.equals(".") && !Character.isDigit(below.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }

                        if(h != 0){
                            var belowPrev = String.valueOf(input.get(i+1).charAt(h-1));
                            if(!belowPrev.equals(".") && !Character.isDigit(belowPrev.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }

                        if(h < input.size() - 1){
                            var belowNext = String.valueOf(input.get(i+1).charAt(h));
                            if(!belowNext.equals(".") && !Character.isDigit(belowNext.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }
                        if(h != 0){
                            var prev = String.valueOf(input.get(i).charAt(h-1));
                            if(!prev.equals(".") && !Character.isDigit(prev.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }
                        
                        if(h != input.size() - 1){
                            var next = String.valueOf(input.get(i).charAt(h));
                            if(!next.equals(".") && !Character.isDigit(next.toCharArray()[0])){
                                sum += Integer.parseInt(fullNumber);
                                break;
                            }
                        }
                    }
                    j += (lastNumberIndex) - j;
                }
            }
        }
        System.out.println("Sum is: " + sum);
    }

}

