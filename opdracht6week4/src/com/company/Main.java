package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);
        //ask for input
        int inPut = userInput.nextInt();
        for(int I =1; I<=inPut; I++){
            for(int J = 0; J<I; J++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
