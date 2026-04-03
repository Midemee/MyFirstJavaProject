public class Account {
//declare the instance variables
public static void main(String[] args){}

  private String name;
  private double balance;

//declare the constructor and it receives 2 paramenters
  public Account(String name, double balance) {
  this.name = name;

  if (balance > 0.0) {
  this.balance = balance;
}
}

//declare the set and get methods
   public void setName(String name) {
   this.name = name;
}
   public String getName() {
   return name;
}

public void deposit(double depositAmt) {
  if (depositAmt > 0.0) {
      balance = balance + depositAmt;
}

}
  public double getBalance() {
  return balance;
}

  public double withdraw(double withdrawAmt) {
  if (withdrawAmt > balance) {
  System.out.println("Withdrawal amount exceeded account balance");
  return 0.0;
} 
else {
  balance = balance - withdrawAmt;
  return withdrawAmt;
}
 
} 

}