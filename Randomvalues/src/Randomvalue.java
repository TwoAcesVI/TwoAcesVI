import java.util.Random;
import java.util.Scanner;


public class Randomvalue {
    public static void main(String[] args){
        Random r = new Random();
        Scanner Number1= new Scanner(System.in);
        Scanner Number2= new Scanner(System.in);
        Scanner Answer = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int Low = Number1.nextInt();
        System.out.print("Enter the higher bound: ");
        int High = Number1.nextInt();

        int Random1 = r.nextInt(High-Low) + Low;
        int Random2 = r.nextInt(High-Low) + Low;

        System.out.print(Random1);
        System.out.print(" + ");
        System.out.print(Random2);
        System.out.print(" = ");
        int inputAnswer = Answer.nextInt();
        int Result = Random1+Random2;

        if (inputAnswer==Result){
            System.out.println("Correct!");
        }else{
            System.out.println("This is incorrect! The right answer was: " + Result);
        }
    }
}

