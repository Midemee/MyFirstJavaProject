//Practicing Instance variables, they are generally private which means they can only be accessed within this class
//Generally, instance variables should be declared private and methods are public, but some methods are declared private
//The getters and setters is used to access them,basically used to get and set the value
//getter and setter method help protects object data and add rules for accessing or modifying them
//GETTERS = Methods that make a field READABLE... used to retrieve the name from the object
//SETTERS = Methods that make a field WRITEABLE... used to set the name in the object

public class Account {

    private String name;
    private double balance;

    // create an account constructor that receives 2 parameters
    public Account(String name, double balance){
        this.name = name;
        //Validate that the balance is greater 0.0
        if (balance > 0.0){
            this.balance = balance;
        }
    }

    //add a method that deposits only a valid amount to the balance
    public void deposit (double depositAmount) {
        if (depositAmount > 0.0){ //if the deposit amount is valid
            balance = balance + depositAmount; //add it to the balance
        }
    }

    //Add a method that withdraws money from an account and
    //Ensure that the withdrawal amount doesn't exceed the account balance
    public void withdraw(double withdrawal){
        if(withdrawal <= balance){
           balance = balance - withdrawal;
        }
        else{
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

    }

}
