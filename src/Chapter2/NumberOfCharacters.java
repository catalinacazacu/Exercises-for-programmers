package Chapter2;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 * How do I check if the user input is empty?
 */
public class NumberOfCharacters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the input string ");
        String s = scan.next();
        if (s.isEmpty())
            System.out.println("Input cannot be empty");
        System.out.println(s  + " has " + s.length() + " characters");

    }
}
