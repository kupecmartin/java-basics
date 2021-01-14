package sk.martin.basics;

import java.util.Scanner;

/**
 * Create an application which will ask for a username and then for his/her ability.
 * Then the program will print "name is ability", see image below.
 * The application screen sample:
 *
 * Hi, what is your name?
 * Bill Gates
 * What are you like?
 * ultraepic rich
 * Bill Gates is ultraepic rich
 */

public class WhatAreYouLike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what is your name?");
        String name = scanner.nextLine();
        System.out.println("What are you like?");
        String ability= scanner.nextLine();
        System.out.println(name + " is " + ability);
    }
}
