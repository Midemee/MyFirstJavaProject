//Write a simple Mad Lim game program
import java.util.Scanner;
public class Tutorial {
    public static void main (String[] args) {
//        Scanner game = new Scanner(System.in);
//
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.print("Enter an Adjective (description): ");
//        adjective1 = game.nextLine();
//        System.out.print("Enter a Noun (animal or person): ");
//        noun1= game.nextLine();
//        System.out.print("Enter an Adjective (description): ");
//        adjective2 = game.nextLine();
//        System.out.print("Enter a Verb that ends with '-ing' (action): ");
//        verb1 = game.nextLine();
//        System.out.print("Enter an Adjective (description): ");
//        adjective3 = game.nextLine();
//
//        System.out.println("\nToday i went to a " + adjective1 + " zoo");
//        System.out.println("In an exhibit, I saw a " + noun1 + "." );
//        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
//        System.out.println("I was " + adjective3 + "!");
//
//        game.close();

        Scanner cart = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = cart.nextLine();

        System.out.print("What is the price for each?: ");
        price = cart.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = cart.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total); 


        cart.close();



    }
}
