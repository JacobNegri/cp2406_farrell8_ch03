/**
 * Created by jc319816 on 22/08/16.
 */

import java.util.Scanner;

public class NumberDemo2
{
    public static void main (String args[])
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = kb.nextInt();
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}