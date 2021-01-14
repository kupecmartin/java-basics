package sk.martin.basics;
/**
 * Create an application that will ask for 2 words.
 * Then, print by how many characters the second word is longer than the first one.
 * Ignore white spaces before and after the text.
 * <p>
 * The application screen sample:
 * <p>
 * Console application Enter a word:
 * dandelion
 * Enter a shorter word:
 * primrose
 * The first word is 1 characters longer than the second word.
 */

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        String firstWord, secondWord;
        System.out.println("Enter a word: ");
        firstWord = scanner.nextLine();
        System.out.println("Enter a shorter word: ");
        secondWord = scanner.nextLine();
        compareWordLength(firstWord, secondWord);
    }

    public static void compareWordLength(String firstWord, String secondWord) {
        int wordDiff = ((firstWord.trim().length()) - (secondWord.trim().length()));
        if (wordDiff < 0) {
            System.out.println("Second word is longer");
        } else if (wordDiff > 0) {
            System.out.println("First word is longer");

        } else {
            System.out.println("Length of the words is equal");
        }
    }
}