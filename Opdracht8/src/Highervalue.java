import java.util.Scanner;

public class Highervalue {

    public static void main(String[]args){
        Scanner Input1 = new Scanner(System.in);
        System.out.print("Input value 1:\n>");

        Double Inputuser1= Input1.nextDouble();

        Scanner Input2 = new Scanner(System.in);
        System.out.print("Input value 2:\n>");

        Double Inputuser2= Input2.nextDouble();

        if (Inputuser1>Inputuser2) {
            System.out.print("The largest value is: ");
            System.out.println(Inputuser1);
        }else{
            System.out.print("The largest value is: ");
            System.out.println(Inputuser2);
        }
        return;
    }
}
