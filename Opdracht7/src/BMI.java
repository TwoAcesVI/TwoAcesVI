import java.util.Scanner;

public class BMI {

    public static void main(String[] args)
    {
        Scanner L= new Scanner(System.in);
        System.out.printf("What is your length?\n>");
        Double Length= L.nextDouble();

        Scanner W= new Scanner(System.in);
        System.out.printf("What is your weight?\n>");
        Double Weight=W.nextDouble();

        Double BMI = Weight / Math.pow(Length, 2);
        System.out.print("Your BMI is: ");
        System.out.println(BMI);

        if (BMI <18.5){
            System.out.println("You are: Underweight");
        } else if  (BMI>=18.5 && BMI<25 ) {
            System.out.println("You are: Normal Weight");
        } else if (BMI>=25 && BMI<30 ){
            System.out.println("You are: Overweight");
        } else if (BMI>=30){
            System.out.println("You are: Obesity");
        }
        return;
    }
}
