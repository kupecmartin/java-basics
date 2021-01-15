package sk.martin.basics;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Create an application that asks for 2 intervals (high and low bounds as integers).
 * Then it'll print all the number pairs, from the first and the second interval,
 * whose sum is contained at least in one of these intervals.
 * <p>
 * The application screen sample:
 * <p>
 * Console application Enter the left bound of the 1st interval: 5
 * Enter the right bound of the 1st interval: 25
 * Enter the left bound of the 2nd interval: 4
 * Enter the right bound of the 2nd interval: 16
 * Number pairs (1st from first interval and 2nd from second interval),
 * whose sum is at least in one of the intervals:
 */
public class Intervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter the lower bound of the 1st interval:");
        int lowerBoundFirst = scanner.nextInt();
        System.out.println("Enter the higher bound of the 2nd interval:");
        int higherBoundFirst = scanner.nextInt();
        System.out.println("Enter the lower bound of the 1st interval:");
        int lowerBoundSecond = scanner.nextInt();
        System.out.println("Enter the higher bound of the 2nd interval:");
        int higherBoundSecond = scanner.nextInt();
        int highestNumber = Math.max(higherBoundFirst, higherBoundSecond);
        int sum;
        for (int i = lowerBoundFirst; i <= highestNumber; i++) {
            for (int j = lowerBoundSecond; j <= highestNumber; j++) {
                sum = i + j;
                if (sum <= highestNumber) {
                    System.out.printf("[%d;%d], ", i, j);
                }
            }
        }
    }
}


