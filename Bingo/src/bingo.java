import java.util.Scanner;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;

public class bingo {
    public int[] userBingo = new int[5];
    Scanner sc = new Scanner(System.in);

	public void run() {
	    boolean running = true;
	    while(running){
	        menu();
            int userInput = sc.nextInt();
            if(userInput==1){
                optie1();
            }else if(userInput==2){
                //optie2
                System.out.println("You chose option 2!");
            }else if(userInput==3){
                //optie3
                System.out.println("You chose option 3!");
            }else if(userInput==9){
                System.out.println("System shutting down!");
                running=false;
            }else{
                System.out.println("Wrong input!");
            }
        }
	}

	public void optie1(){
	    boolean validInput = true;
	    while(validInput){
	        for(int i = 0 ; i<5;){
                System.out.print("Geef een waar voor veld "+(i+1)+" : ");
                int userInput = sc.nextInt();
                if(userInput>20){
                    System.out.println("Deze waarde is te hoog! Alle waarden moeten tussen de 0 en 20 liggen.");
                }else if(userInput<=0){
                    System.out.println("Deze waarde is te laag! Alle waarden moeten tussen de 0 en 20 liggen.");
                }else{
                    userBingo[i]=userInput;
                    i++;
                }
                if(i==5){
                    System.out.print("Je bingo-kaart bevat de volgende nummers: " );
                    System.out.println(Arrays.toString(userBingo));
                    validInput=false;
                }
            }
        }
    }

	public void menu(){
        System.out.println("**************************");
        System.out.println("*Bingo");
        System.out.println("**************************");
        System.out.println("*1) Maak een bingo kaart");
        System.out.println("*2) Trek een bal");
        System.out.println("*3) Controleer Bingo-kaart");
        System.out.println("*9) Afsluiten");
        System.out.println("**************************");
    }



	public static void main (String[] args){
        new bingo().run();
	}
}
