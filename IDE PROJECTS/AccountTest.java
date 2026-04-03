import java.util.Scanner;
//Creating and manipulating an Account object
public class AccountTest {
    public static void main(String[] args) {
        //Create two account objects
        Account account1 = new Account("John Paul",  50.00);
        Account account2 = new Account("Jane Parker", -7.53 );

        //Display the initial value of each account
        System.out.printf("%s, Your balance is: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s, Your balance is: %.2f%n", account2.getName(), account2.getBalance());

        //Create a Scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for Account1: ");
        double depositAmount = input.nextDouble();//store the value entered by the user in a variable
        System.out.printf("%nAdding #%.2f to Account1 balance %n", depositAmount);
        account1.deposit(depositAmount); //Add the deposit to Account1 balance

        //display the balances
        System.out.printf("%s, Your account balance is: #%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s, Your balance is: #%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for Account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding #%.2f to Account2 balance %n", depositAmount);
        account2.deposit(depositAmount); //Add the deposit to Account2 balance

        System.out.printf("%s, Your account balance is: #%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s, Your balance is: #%.2f%n", account2.getName(), account2.getBalance());

        //Test the withdrawal method
        System.out.println("Enter the amount to withdraw from account1: ");
        double withdrawal = input.nextDouble();
        account1.withdraw(withdrawal);
        System.out.printf("Your balance is: %.2f", account1.getBalance());

    }
}
