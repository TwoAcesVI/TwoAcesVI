package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Opdracht9week4 {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int user = userInput.nextInt();
        boolean User = true;

        double radius = Math.PI * (user * user);
        double circleSurface = Math.PI * (user * 2);
        double sphereSurface = 4 * Math.PI * (user * user);
        double sphereVolume = (4 / 3) * Math.PI * (user * user * user);


        while(User){
            if (user>0) {
                System.out.println("Circumference of a circle with radius " + user + ": " + radius);
                System.out.println("Surface area of a circle with radius " + user + ": " + circleSurface);
                System.out.println("Surface of a sphere with radius " + user + ": " + sphereSurface);
                System.out.println("Enclosed volume of a sphere with radius " + user + ": " + sphereVolume);
                User = false;
            }else if (user ==0){
                System.out.println("That's all, folks!");
                User = false;
            }else if (user<0){
                System.out.println("Invalid radius, try again!");
                System.out.print("Enter radius:");
                user = userInput.nextInt();
            }
        }
    }
}
