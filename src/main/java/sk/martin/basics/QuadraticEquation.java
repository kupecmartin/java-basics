package sk.martin.basics;

/**
 * Create an application that will ask for the a, b and c coefficients of the quadratic equation
 * ax^2 + bx + c = 0 and calculate its real roots using the discriminant.
 * Don't take complex roots into consideration. In case that the discriminant is negative,
 * print that the equation doesn't have a solution.
 * <p>
 * The application screen sample:
 * <p>
 * Console application
 * Gradually enter the a,b,and c coefficients for the quadratic equation ax^2+bx+c=0 :
 * 2
 * -4
 * 2
 * The result only has one root x = 1.000000
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Gradually enter the a,b,and c coefficients for the quadratic equation ax^2+bx+c=0 : ");
        System.out.println("a may not be 0, plese insert  a = ");
        a = scanner.nextDouble();
        while (a == 0) {
            System.out.println("a may not be 0, please try again! a  = ");
            a = scanner.nextDouble();
        }
            System.out.println("b = ");
            b = scanner.nextDouble();
            System.out.println("c = ");
            c = scanner.nextDouble();
            double discriminant = (int) Math.pow(b, 2) - (4 * a * c);
            calculateRoots(discriminant, a, b);
    }

    private static void calculateRoots(double discriminant, double a, double b) {
        double rootOne, rootTwo;
        if (discriminant > 0) {
            System.out.println("Discriminant is " + discriminant);
            rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
            rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("Two solutions " + rootOne + " and " + rootTwo);

        } else if (discriminant == 0) {
            System.out.println("Discriminant is " + discriminant);
            rootOne = rootTwo = -b / (2 * a);
            System.out.format("x1 = x2 = " + rootOne);
        } else {
            System.out.println("Discriminant is " + discriminant);
            System.out.println("No real Solution");
        }
    }
}
