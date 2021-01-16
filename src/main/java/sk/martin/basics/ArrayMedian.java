package sk.martin.basics;
/**
 * Create an application that will ask for a few numbers.
 * The user will specify how many numbers he or she wants to enter.
 * The application will then calculate the median from these numbers.
 * The program will print the absolute deviation from the median for each number.
 * To keep it simple, forget that when the number is even
 * the median should be calculated as the average of the two numbers in the middle.
 * You may even just pick the middle index which is length / 2;
 * <p>
 * The application screen sample:
 * <p>
 * Console application Enter the amount of numbers you plan on entering:
 * 5
 * Enter number 1: 3
 * Enter number 2: 8
 * Enter number 3: 6
 * Enter number 4: 1
 * Enter number 5: 7
 * 3 deviates from the median by -3.000000
 * 8 deviates from the median by 2.000000
 * 6 deviates from the median by 0.000000
 * 1 deviates from the median by -5.000000
 * 7 deviates from the median by 1.000000
 */

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("Enter the amount of numbers you plan on entering: ");
        int arrLength = scanner.nextInt();
        double[] arrayOfNumbers = new double[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arrayOfNumbers[i] = scanner.nextDouble();
        }
        System.out.println("Median is " + calculateMedian(arrayOfNumbers));
        for (double number : arrayOfNumbers) {
            System.out.println(number + " deviates from the median by " + (number - calculateMedian(arrayOfNumbers)));
        }
    }

    public static double calculateMedian(double[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        if (arrayOfNumbers.length % 2 == 0) {
            double lowerMed = arrayOfNumbers[(arrayOfNumbers.length / 2) - 1];
            double higherMed = arrayOfNumbers[arrayOfNumbers.length / 2];
            return (lowerMed + higherMed) / 2;
        } else {
            return arrayOfNumbers[arrayOfNumbers.length / 2];
        }

    }


}
