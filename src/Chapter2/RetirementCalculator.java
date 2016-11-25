package Chapter2;
import java.time.Year;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class RetirementCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current age? ");
        String currentage = scan.next();
        System.out.println("At what age would you like to retire? ");
        String retirementage = scan.next();
        int age = Integer.parseInt(currentage);
        int retire = Integer.parseInt(retirementage);
        int dif = retire - age;
        int year = Year.now().getValue();
        int retirementyear = year + dif;
        System.out.println("You have " + dif + " years left until you can retire." + "\n" +
                           "It" + "\'" + "s " + year + ", so you can retire in " + retirementyear + ".");


    }
}
