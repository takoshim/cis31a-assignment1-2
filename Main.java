/*********************************
 * Your Name: Takeo Shimazu
 * Class and Section: Sp22 CIS D036A 01Y, 64Z Java Programming
 * Assignment Number: 1 Part 2
 * Due Date: Apr 20, 2022
 * Date Submitted: Apr 15, 2022
 *******************************/
package com.takeo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        long number = s.nextLong();
        double theSquareRoot = sqrt(number);
        System.out.printf("%s %d %s %5.2f", "Square root of ", number, " is ", theSquareRoot);
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = ( lastGuess + (n / lastGuess) ) / 2;

        while ( (nextGuess - lastGuess) > 0.0001 || (lastGuess - nextGuess) > 0.0001 ) {
            lastGuess = nextGuess;
            nextGuess = ( lastGuess + (n / lastGuess) ) / 2;
        }
        return nextGuess;
    }
}
