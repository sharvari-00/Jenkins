package com.example.scientificcalculator;
import java.util.Scanner;

public class calculator {
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public static double naturalLogarithm(double x) {
        return Math.log(x);
    }

    public static double power(double x, double b) {
        return Math.pow(x, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the value of x: ");
                double x = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + squareRoot(x));
                        break;
                    case 2:
                        System.out.println("Result: " + factorial((int) x));
                        break;
                    case 3:
                        System.out.println("Result: " + naturalLogarithm(x));
                        break;
                    case 4:
                        System.out.print("Enter the value of b: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + power(x, b));
                        break;
                }

            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

}
