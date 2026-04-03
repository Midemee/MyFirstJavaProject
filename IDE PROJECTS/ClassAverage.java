// Solving the class-average problem using counter-controlled iteration.
import java.util.Scanner;

import java.util.Scanner;
public class ClassAverage {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       //initialization phase... initialize sum of grades entered by user
       int total = 0;
       int gradeCounter = 1;

       //processing phase uses counter-controlled iteration
       while (gradeCounter <= 10) { //loop 10 times
           System.out.print("Enter grade: ");
           int grade = input.nextInt();
           total = total + grade;
           gradeCounter = gradeCounter + 1;
       }

       //Termination phase
       int average = total/10;

       //display total and average of grades
       System.out.printf("%nTotal of all 10 grades is %d%n", total);
       System.out.printf("Class average is %d%n", average);
   }
}
