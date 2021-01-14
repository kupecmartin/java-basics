package sk.martin.basics;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Create an application which will ask for a string.
 * Find out whether the entered string contains the word "ict.social", case insensitively.
 * <p>
 * The application screen sample:
 * <p>
 * Console application Enter the string:
 * I mainly learn about programming at ICT.social, but I also picked up a bit at school.
 * true
 */

public class TextFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter your text: ");
        String scannedText = scanner.nextLine();
        System.out.println("Enter searched word or string : ");
        String searchedText = scanner.nextLine();
        System.out.println(scannedText.contains(searchedText));
    }

}
