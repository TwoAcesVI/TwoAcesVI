import java.util.*;
import java.util.Random;

public class Bingo2 {
    public int[] userBingo = new int[5];
    public List<Integer> randomNumbers = new ArrayList<>();
    public boolean[] userKaartgoed = new boolean[5];
    public int aantalBallengetrokken=0;
    Scanner sc = new Scanner(System.in);

    public void run() {
        boolean running = true;
        boolean[] userKaartgoed = {false,false,false,false,false};
        while (running) {
            menu();
            int userInput = sc.nextInt();
            if (userInput == 1) {
                optie1();
            } else if (userInput == 2) {
                optie2();
            } else if (userInput == 3) {
                //optie3
                System.out.println("You chose option 3!");
            } else if (userInput == 9) {
                System.out.println("System shutting down!");
                running = false;
            } else {
                System.out.println("Wrong input!");
            }
        }
    }

    public void optie1() {
        boolean validInput = true;
        for (int i = 1; i <= 20; i++) {
            randomNumbers.add(new Integer(i));
        }
        Collections.shuffle(randomNumbers);
        System.out.println(randomNumbers.toString());
        while (validInput) {
            for (int i = 0; i < 5; ) {
                System.out.print("Geef een waar voor veld " + (i + 1) + " : ");
                int userInput = sc.nextInt();
                if (userInput > 20) {
                    System.out.println("Deze waarde is te hoog! Alle waarden moeten tussen de 0 en 20 liggen.");
                } else if (userInput <= 0) {
                    System.out.println("Deze waarde is te laag! Alle waarden moeten tussen de 0 en 20 liggen.");
                } else {
                    userBingo[i] = userInput;
                    i++;
                }
                if (i == 5) {
                    System.out.print("Je bingo-kaart bevat de volgende nummers: ");
                    System.out.println(Arrays.toString(userBingo));
                    validInput = false;
                }
            }
        }
    }

    public void optie2() {
        aantalBallengetrokken++;
            if (userBingo[1] == 0) {
                System.out.println("Voordat je een bal mag trekken moet je eerst een Bingo-kaart maken!");
            }else{
                System.out.print("[");
                    for(int i=0; i<5;i++){
                        if(userBingo[i]==randomNumbers.get(aantalBallengetrokken-1)){
                            userKaartgoed[i]=true;
                        }
                        if(userKaartgoed[i]==true){
                        System.out.print("(");
                        System.out.print(userBingo[i]);
                        System.out.print(")");
                        }else{
                        System.out.print(userBingo[i]);
                        }
                        System.out.print(",");
                }
                System.out.print("]");
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
        new Bingo2().run();
    }
}
