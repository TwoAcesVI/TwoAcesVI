import java.util.Scanner;

public class Opdracht3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Firstnumber, Secondnumber;

        Firstnumber= sc.nextInt();

        Scanner ac = new Scanner(System.in);

        Secondnumber= ac.nextInt();

        int vraag1= Firstnumber + Secondnumber;
        int vraag2= Firstnumber - Secondnumber;
        int vraag3= Secondnumber - Firstnumber;
        int vraag4= Firstnumber * Secondnumber;
        int vraag5= Firstnumber / Secondnumber;
        int vraag6= Secondnumber / Firstnumber;
        int vraag7= Firstnumber % Secondnumber;
        int vraag8= Secondnumber % Firstnumber;

        System.out.println(vraag1);
        System.out.println(vraag2);
        System.out.println(vraag3);
        System.out.println(vraag4);
        System.out.println(vraag5);
        System.out.println(vraag6);
        System.out.println(vraag7);
        System.out.println(vraag8);
    }
}