import java.util.Scanner;

public class opdracht1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        double[] grades;
        grades = new double[10];
        double sum=0;

        for(int i = 0; i<grades.length ; i++){
            System.out.print("Please enter grade " + (i+1) + " :");
            grades[i] = sc.nextDouble();
            sum+=grades[i];
        }
        System.out.println();
        System.out.println("This is your list of grades");
        for(int j = 0; j<grades.length;j++){
            System.out.println("grade "+ (j+1) + "= " + grades[j]);
        }
        System.out.println(sum);
        System.out.print("The average of your grades is: " + (sum/10));
    }
}
