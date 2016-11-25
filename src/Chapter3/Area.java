package Chapter3;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class Area {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");
        String length = scan.next();
        System.out.println("What is the width of the room in feet? ");
        String width = scan.next();
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int area = l * w;
        double factor = 0.09290304;
        double areameters = area * factor;
        double roundoff = Math.round(areameters * 1000.000)/1000.000;
        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet." + "\n" +
                           "The area is " + "\n" + area + " square feet" + "\n" + roundoff + " square meters");
    }
}
