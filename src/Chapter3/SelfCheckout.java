package Chapter3;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class SelfCheckout {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of item 1: ");
        String price1 = scan.next();
        System.out.println("Enter the quantity of item 1: ");
        String quantity1 = scan.next();
        System.out.println("Enter the price of item 2: ");
        String price2 = scan.next();
        System.out.println("Enter the quantity of item 2: ");
        String quantity2 = scan.next();
        System.out.println("Enter the price of item 3: ");
        String price3 = scan.next();
        System.out.println("Enter the quantity of item 3: ");
        String quantity3 = scan.next();
        double p1 = Double.parseDouble(price1);
        int q1 = Integer.parseInt(quantity1);
        double p2 = Double.parseDouble(price2);
        int q2 = Integer.parseInt(quantity2);
        double p3 = Double.parseDouble(price3);
        int q3 = Integer.parseInt(quantity3);
        double subtotal = p1 * q1 + p2 * q2 + p3 * q3;
        double tax = (5.5 * subtotal) / 100;
        double total = subtotal + tax;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
