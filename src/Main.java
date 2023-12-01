import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        var taskReader = new TaskReader();
        try {
            ArrayList x = taskReader.readTask("1", "1");

            var dayone = new one();
            var result = dayone.SolveFirst(x);
            System.out.println("Day one task one: " + result);

            var y = new ArrayList<String>();
            y.add("nineight1");
            y.add("eighthree");
            var res2 = dayone.SolveSecond(x);
            System.out.println("Day one task two:" + res2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}