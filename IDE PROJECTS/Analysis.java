import java.util.Scanner;
public class Analysis {
    public static void main(String[] args){
        //Create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        //Initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        //Process 10 students using counter-controlled loop
        while (studentCounter <= 10) {
            //Prompt user for input and obtain value from user
            System.out.println("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            //If...else is nested in the while statement
            if (result == 1) {
                passes += 1;
            }
            else {
               failures += 1;
            }
            //Increment studentCounter so loop eventually terminates
            studentCounter += 1;
        }

        //Termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        //Determine whether more than 8 students passed
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}
