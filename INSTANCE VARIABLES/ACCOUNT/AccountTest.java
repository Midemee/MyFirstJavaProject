import java.util.Scanner;
 public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account("Tony Tones", 6.50);
    Account account2 = new Account("Coker Clark", 10.30);
    displayAccount(account1);
    displayAccount(account2);
    
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter amount to deposit to Account1: ");
    double payment = input.nextDouble();
    account1.deposit(payment);
    displayAccount(account1);

    System.out.print("Enter amount to deposit to Account2: ");
    payment = input.nextDouble();
    account2.deposit(payment);
    displayAccount(account2);

    System.out.print("Enter amount to withdraw from Account1: ");
    double amtWithdraw = input.nextDouble();
    account1.withdraw(amtWithdraw);
    
    System.out.print("Enter amount to withdraw from Account2: ");
    amtWithdraw = input.nextDouble();
    account2.withdraw(amtWithdraw);
    
    displayAccount(account1);
    displayAccount(account2);
}

public static void displayAccount(Account accountToDisplay) {
    System.out.printf("%s balance is %.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
}
}