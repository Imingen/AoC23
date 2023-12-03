package solvers;
import java.util.ArrayList;
import java.util.stream.Stream;

public class one {

    public int SolveFirst(ArrayList<String> input){

        var sum = 0;
        for(String elem : input){
            String digitsOnly = elem.replaceAll("[^0-9]", "");
            String first = String.valueOf(digitsOnly.charAt(0));
            String last = String.valueOf(digitsOnly.charAt(digitsOnly.length() - 1));

            var imsim = first + last;
            sum += Integer.parseInt(imsim);

        }

        return sum;
    }

    public int SolveSecond(ArrayList<String> input){
        var stringValues = Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine").toList();
        var stringValuesButNumbers = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9").toList();

        var sum = 0;
        for(String elem : input){
            System.out.println("elem: " + elem);

            var elemNew = elem;
            var elemBytes = elem.toCharArray();
            for(String e : stringValues){
                if(elem.contains(e)){
                    var hei = stringValuesButNumbers.get(stringValues.indexOf(e));
                    elemNew = elem.replace(e, hei);
                    for(int i = 0; i < elemNew.length(); i++){
                        if(elemNew.toCharArray()[i] == (hei.toCharArray()[0])){
                            elemBytes[i] = hei.toCharArray()[0];
                        }

                    }
                }
            }
            elemNew = String.valueOf(elemBytes);
            System.out.println("elemNew: " + elemNew);
            String digitsOnly = elemNew.replaceAll("[^0-9]", "");
            System.out.println("digitsOnly: " + digitsOnly);
            String first = String.valueOf(digitsOnly.charAt(0));
            String last = String.valueOf(digitsOnly.charAt(digitsOnly.length() -1));
            var imsim = first + last;
            System.out.println("imsim: " + imsim);

            sum += Integer.parseInt(imsim);
            System.out.println("Sum: " + sum);
        }

        return sum;
    }

}
