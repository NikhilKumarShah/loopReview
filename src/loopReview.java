package src;
import java.util.Scanner;

public class loopReview {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        int count = 0;

        while (grade >= 0) {
            System.out.println("Please input a grade from 0 to 110 (-1 to terminate):");
            grade = input.nextDouble();

            if (grade == -1) {
                break; // Terminate the loop if the user inputs -1
            } else if (grade < 0 || grade > 110) {
                System.out.println("Invalid: Must be between 0 and 110");
            } else {
                sum += grade;
                count++;
            }

            System.out.println("Count is " + count + ", Sum is " + sum);
        }

        System.out.println("Program terminated. Final Count: " + count + ", Final Sum: " + sum);
        input.close();
    }
}