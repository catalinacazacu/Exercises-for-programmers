package Chapter3;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class PaintCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String length = scan.next();
        String width = scan.next();
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int area = l * w;
        int standard = 350;
        int gallons = area / standard;
        if (gallons * standard != area)
            gallons ++;
        System.out.println("You will have to purchase " + gallons + " gallons of paint to cover " + area + " square feet.");



    }
}
