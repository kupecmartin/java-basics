package sk.martin.basics;
/**
 * Create an application that asks the user for their first name, last name, and age.
 * Then, print his/her first and last name in UPPERCASE.
 * Lastly, print "Next year you'll be age + 1 years old" on a new line, see image below.
 * The application screen sample:
 * Console application Enter your name:
 * Jesus
 * Enter your surname:
 * Christ
 * Enter your age:
 * 33
 * JESUS CHRIST
 * You're gonna be 34 years old in a year.
 */

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class AgePlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine().toUpperCase();
        System.out.println("Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println(name + surname + "\nYou are gonna be " + (age + 1) + " years old in a year");
    }

}
