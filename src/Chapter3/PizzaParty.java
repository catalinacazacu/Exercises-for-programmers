package Chapter3;
import java.util.Scanner;

/**
 * Created by catalina on 25.11.16.
 * I am not sure I understood corretly this exercise. I assumed that I also have to write the number of slices/pizza as input.
 */
public class PizzaParty {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people? ");
        String people = scan.next();
        System.out.println("How many pizzas do you have? ");
        String pizzas = scan.next();
        System.out.println("How many slices per pizza? ");
        String slices = scan.next();
        int people2 = Integer.parseInt(people);
        int pizzas2 = Integer.parseInt(pizzas);
        int slices2 = Integer.parseInt(slices);
        int each = (pizzas2 * slices2)/people2;
        int leftover = pizzas2 * slices2 - people2;
        System.out.println(people + " people with " + pizzas2 + " pizzas");
        System.out.println("Each person gets " + each + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");

    }
}
