package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);
        int lowerBound;
        int upperBound;
        int postal;
        boolean correct = true;

        while (correct) {
            System.out.print("Input lower bound:\n>");
            lowerBound = userInput.nextInt();
            System.out.print("Input higher bound:\n>");
            upperBound = userInput.nextInt();
            if (lowerBound >= upperBound) {
                System.out.println("The lower bound exceeds the upper bound.");
            } else {
                System.out.print("Input a value between " + lowerBound + " and " + upperBound + ": ");
                postal = userInput.nextInt();
                while (correct) {
                    if (postal < lowerBound) {
                        System.out.print("Invalid value, please try again:\n>");
                        postal = userInput.nextInt();
                    } else if (postal > upperBound) {
                        System.out.print("Invalid value, please try again:\n>");
                        postal = userInput.nextInt();
                    } else {
                        System.out.println("Value accepted!");
                        correct = false;
                    }
                }
            }
        }
        return;
    }
}