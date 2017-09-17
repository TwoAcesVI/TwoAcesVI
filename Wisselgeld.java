import java.util.Scanner;

public class Wisselgeld {

    public static void main(String[] args){
        Scanner due = new Scanner(System.in);
        Scanner paid = new Scanner(System.in);
        int due1;
        int paid1;
        int change;

        System.out.print("Amount due (in cents); \n> ");
        due1 = due.nextInt();

        boolean valid;
        do {
            System.out.print("Amount paid (in cents); \n> ");
            paid1 = paid.nextInt();
            change = paid1 - due1;
            if(change>0) {
                System.out.print("Change:");
                System.out.println(change);
            }
            valid = change > 0;
            if (!valid) {
                System.out.println("This is not enough money");
            }
        } while (!valid) ;
        int value1 = change/10000;
        if (value1>=1) {
            System.out.print("100 euro: ");
            System.out.println(value1);
            change=change-value1*10000;
        } else {
            System.out.println("100 euro: 0");
        }
        value1 = change/5000;
        if(value1>=1) {
            System.out.print("50 euro: ");
            System.out.println(value1);
            change = change - value1 * 5000;
        } else{
            System.out.println("50 euro: 0");
        }
        value1 = change/2000;
        if(value1>=1){
            System.out.print("20 euro: ");
            System.out.println(value1);
            change = change - value1 * 2000;
        } else {
            System.out.println("20 euro: 0");
        }
        value1 = change/1000;
        if(value1>=1){
            System.out.print("10 euro: ");
            System.out.println(value1);
            change = change - value1 * 1000;
        } else{
            System.out.println("10 euro: 0");
        }
        value1 = change/500;
        if(value1>=1){
            System.out.print("5 euro: ");
            System.out.println(value1);
            change = change - value1 * 500;
        } else {
            System.out.println("5 euro: 0");
        }
        value1 = change/200;
        if(value1>=1){
            System.out.print("2 euro: ");
            System.out.println(value1);
            change = change - value1 * 200;
        } else {
            System.out.println("2 euro: 0");
        }
        value1 = change/100;
        if(value1>=1){
            System.out.print("1 euro: ");
            System.out.println(value1);
            change = change - value1 * 100;
        } else {
            System.out.println("1 euro: 0");
        }
        value1 = change/50;
        if(value1>=1){
            System.out.print("50 cent: ");
            System.out.println(value1);
            change = change - value1 * 50;
        } else {
            System.out.println("50 cent: 0");
        }
        value1 = change/20;
        if(value1>=1){
            System.out.print("20 cent: ");
            System.out.println(value1);
            change = change - value1 * 20;
        }else{
            System.out.println("20 cent: 0");
        }
        value1 = (change+2)/10;
        if(value1>=1){
            System.out.print("10 cent: ");
            System.out.println(value1);
            change = change- 2 - value1 * 10;
        } else {
            System.out.println("10 cent: 0");
        }
        value1 = change;
        if (value1>=3 && value1<=7){
            System.out.print("5 cent: 1");
        } else{
            System.out.print("5 cent: 0");
        }
        return;
    }
}
