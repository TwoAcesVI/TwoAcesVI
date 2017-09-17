import java.util.Scanner;

public class Maxvalue {

    public static void main(String[] args){
        System.out.print("Input value 1:\n>");
        Scanner Input1 = new Scanner(System.in);
        Double InputUser1 = Input1.nextDouble();

        System.out.print("Input value 2:\n>");
        Scanner Input2 = new Scanner(System.in);
        Double InputUser2 = Input2.nextDouble();

        System.out.print("The maximum value:\n>");
        Double Maxvalue = Math.max(InputUser1, InputUser2);
        System.out.print(Maxvalue);

        return;
    }
}
