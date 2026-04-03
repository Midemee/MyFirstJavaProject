import java.util.Scanner;
public class SalesCommission{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	int fee = 200;
	double itemsSold = 0;

	System.out.print("Enter the price of item sold (or -1 to quit): ");
	double items = input.nextDouble();

	while (items != -1) {
	itemsSold += items;
        System.out.print("Enter the price of item sold (or -1 to quit): ");
	items = input.nextDouble();
	}
        double earnings = itemsSold * 0.09 + fee;
	System.out.printf("%s%.2f%n", "The salesperson's earning is: ", earnings);
	

	}
}

