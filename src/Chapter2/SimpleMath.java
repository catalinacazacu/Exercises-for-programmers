package Chapter2;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 */
public class SimpleMath {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first number? ");
        String nr1 = scan.next();
        System.out.println("What is the second number? ");
        String nr2 = scan.next();
        int number1 = Integer.parseInt(nr1);
        int number2 = Integer.parseInt(nr2);
        int sum = number1 + number2;
        int dif = number1 - number2;
        int prod = number1 * number2;
        float quotient = number1 / number2;
        System.out.println(number1 + " + " + number2 + " = " + sum + "\n"
                + number1 + " - " + number2 + " = " + dif + "\n"
                + number1 + " * " + number2 + " = " + prod + "\n"
                + number1 + " / " + number2 + " = " + quotient);
    }

}
