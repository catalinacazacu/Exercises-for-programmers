package Chapter2;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class MadLib {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = scan.next();
        System.out.println("Enter a verb: ");
        String verb = scan.next();
        System.out.println("Enter an adjective: ");
        String adjective =scan.next();
        System.out.println("Enter an adverb: ");
        String adverb = scan.next();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "?");
    }
}
