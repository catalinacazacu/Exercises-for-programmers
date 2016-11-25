package Chapter2;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class PrintingQuotes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = scan.next();
        System.out.println("Who said it?");
        String author = scan.next();
        System.out.println(author + " says, " + "\"" + quote + ".\"");

    }
}
