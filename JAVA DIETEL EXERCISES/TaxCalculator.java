import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the citizen's earnings per year: (0r -1 to exit) ");
	double earnings = input.nextDouble();

	while (earnings != -1) {
	System.out.print("Enter the name of citizen: ");
	String name = input.nextLine();

	double tax = 0;
	if (earnings == 30000) {
	tax = earnings * 0.15;
	System.out.printf("%nThe total earnings with tax applied is %f%n", tax);
	}
	else if (earnings > 30000) {
	tax = earnings * 0.20;
	System.out.printf("The total earnings with tax applied is %f%n", tax);
	}
	else {
	System.out.printf("The total earnings is: %f%n (No tax applied), tax");
	} 

	System.out.print("Enter the citizen's earnings per year: ");
	earnings = input.nextDouble();
	}

	}

}