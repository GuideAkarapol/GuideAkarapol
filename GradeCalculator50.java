import java.util.Scanner;
public class GradeCaculator50 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the GPA calculator for the programming course.");
        System.out.println("You can enter the scores of only 50 students in total.");
        double[] scores = new double[50]; 

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter student " + (i + 1) + "'s score : ");
            double score = input.nextDouble();
            if (score > 100) {
                System.out.println("Please type score 0-100");
                return;
            }
            if (score < 0) {
                System.out.println("Please type score 0-100");
                return;
            }
            scores[i] = score; 
        }

        double sum = 0; 
        for (double value : scores) {
            sum += value;
        }
        double average = sum / scores.length; 

        System.out.println("Score average student = " + Math.round(average));
        if (average >= 90){  
            System.out.println("The student's letter grade is  A");
        }else if (average >= 80){ 
            System.out.println("The student's letter grade is  B");
        }else if (average >= 70){
            System.out.println("The student's letter grade is  C");
        }else if (average >= 60){ 
            System.out.println("The student's letter grade is  D");
        }else 
            System.out.println("The student's letter grade is  F");

        if(average>=60){
            System.out.println("Them pass");
        }else System.out.println("Them not pass");

        if(average>=60){    
            System.out.println("Congratulation!");
        }else
            System.out.print("Don't give up");
    }
}