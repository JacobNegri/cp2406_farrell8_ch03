/**
 * Created by jc319816 on 22/08/16.
 */
import java.util.Scanner;
public class CraftPricing {
    public static void main (String args[])
    {
        String name;
        double price, cost, work;
        Scanner kb = new Scanner(System.in);
        System.out.print("Product name: ");
        name = kb.nextLine();
        System.out.print("Material cost: ");
        cost = kb.nextInt();
        System.out.print("Number of hours work: ");
        work = kb.nextInt();
        price = retailPrice(cost,work);

        System.out.println("The price of the product, " + name + " is $" + price);
    }
    public static double retailPrice(double cost, double hours)
    {
        double price;
        final double RATE = 12.00;
        final double S_AND_H = 7.00;
        price = cost + hours * RATE + S_AND_H;
        return price;
    }
}

