import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String options;
    private int optionCount;
    private Scanner sc;

    public Menu(){
        this.options="";
        this.optionCount=0;
    }

    public void addOption(String option){
        this.optionCount++;
        this.options+=String.format("%s%d|",option,this.optionCount);
        System.out.println(options);

    }
    public int getInput(){
        sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("Choice: ");
            input = sc.nextInt();
        }while(input<1||input>optionCount);
        return input;
    }
}
