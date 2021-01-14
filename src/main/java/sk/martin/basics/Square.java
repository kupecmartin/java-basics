package sk.martin.basics;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Create an application which will ask for an integer and prints its second power (x squared).
 * <p>
 * The application screen sample:
 * <p>
 * Console application Enter a number, and I'll square it:
 * 64
 * Result: 4096
 */
public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Enter a number, and I'll square it: ");
        int intNumber = parseInt(scanner.nextLine());
        int result = (int) Math.pow(intNumber, 2);
        System.out.println("Result: " + result);
    }
}
