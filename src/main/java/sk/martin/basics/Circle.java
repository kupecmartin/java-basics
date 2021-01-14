package sk.martin.basics;
/**
 * Create an application that will ask for a circle's radius. Then print its circumference and its area.
 *
 * The application screen sample:
 * Enter the circle's radius (cm):
 * 12.1
 * The circle's circumference based on the given radius is: 75.98801 cm
 * Area of the circle is: 459.7275 cm^2
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class Circle {
    public static void main(String[] args) {
        double r,p,a;
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter the circle's radius (cm): ");
        r = parseDouble(scanner.nextLine());
        p = perimeter(r);
        a = area(r);
        System.out.println("The circle's circumference based on the given radius is: " + p + " cm");
        System.out.println("Area of the circle is: " + a + " cm^2");

    }
    static double perimeter(double r){
        return (2 * Math.PI * r);
    }

    static double area(double r) {
        return (Math.PI * r * r);
    }
}
