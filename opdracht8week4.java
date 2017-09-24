package com.company;
import java.util.Random;
import java.util.Scanner;
public class opdracht8week4 {

    public static void main(String[] args) {
	// write your code here
        int max = 6;
        int min = 1;
        int range = max-min+1;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Amount of tosses?\n>");
        double tosses = userInput.nextDouble();
        double dice1=0;
        double dice2=0;
        double dice3=0;
        double dice4=0;
        double dice5=0;
        double dice6=0;

        for(int i = 1 ; i<=tosses;i++ ){
            int roll =(int)(Math.random()* range +1);
            if (roll==1){
                dice1++;
            }else if(roll==2){
                dice2++;
            }else if(roll==3){
                dice3++;
            }else if(roll==4){
                dice4++;
            }else if(roll==5){
                dice5++;
            }else if(roll==6){
                dice6++;
            }
        }
        int Dice1 = (int) dice1;
        int Dice2 = (int) dice2;
        int Dice3 = (int) dice3;
        int Dice4 = (int) dice4;
        int Dice5 = (int) dice5;
        int Dice6 = (int) dice6;

        System.out.println("Ones: " + Dice1);
        System.out.println("Twos: " + Dice2);
        System.out.println("Three: " + Dice3);
        System.out.println("Fours: " + Dice4);
        System.out.println("Fives: " + Dice5);
        System.out.println("Sixes: " + Dice6);

        double average = (dice1+dice2*2+dice3*3+dice4*4+dice5*5+dice6*6)/tosses;
        System.out.print("Average: ");
        System.out.print(average);
    }
}
