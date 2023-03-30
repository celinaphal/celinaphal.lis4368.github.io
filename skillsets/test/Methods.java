import java.util.Scanner;

class Methods
{
    public static void getRequirements()
    {
        System.out.println("Program uses methods to:\nadd, subtract, multiply, divide and power floating point numbers, rounded to two decimal places.");
        System.out.println("Note: Program checks for non-numeric values, and division by zero.");
        System.out.println();

        System.out.println("Enter mathematical operation (a=addition, s=subtraction, m=multiplication, d=division, e=exponentation): ");
        System.out.println();

        System.out.println("Incorrect operation. Please enter correct operation: d");
        System.out.println("Please enter first number: x");
        System.out.println("Not valid number!");
        System.out.println();

        System.out.println("Please try again. Please enter first number: 3");
        System.out.println("Please enter second number: y");
        System.out.println("Not valid number!");
        System.out.println();

        System.out.println("Please try again. Enter second number: 0");
        System.out.println("Cannot divide by zero!");
        System.out.println();

        System.out.println("Enter mathematical operation (a=addition, s=subtraction, m=multiplication, d=division, e=exponentation): ");
        System.out.println("Please enter first number: 3");
        System.out.println("Please enter first number: 2");

        System.out.println("3.0 / 2.0 = 1.50");

    }
}