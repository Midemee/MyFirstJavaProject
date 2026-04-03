public class Main {
    public static void main(String[] args){
        //This is my first Java Program
        /*
        Trying out the multi line comments
        with the traditional comments
         */
        System.out.println("Hello, I'm Mide");
        System.out.println("This is my first Java Program");
        System.out.println("Let's see how it goes");
        System.out.println();
        System.out.println();
        //sout is the shortcut for system.out.println
        //PRIMITIVE DATATYPES
        //int stands for integer- its for whole numbers
        //double is for numbers and can contain decimals
        //char is for characters

        double price =40.32;
        int year = 2025;
        char symbol = '!';
        boolean isStudent = false;
        boolean forSale = true;
        System.out.println("This year is " + year);
        System.out.println("$" + price);
        System.out.println(symbol);
        System.out.println(forSale);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }

        //REFERENCE TYPES
        //Strings
        String name = "Aramide";
        String food = "Protein";
        String email = "aramide123@gmail.com";
        System.out.println("My name is " + name);
        System.out.println("My favorite food is " + food + " and my email address is " + email);
        System.out.println(3*5);
        int x = 10;
        int y = 5;
        System.out.println("The result is " + (x/y));
        System.out.println("Welcome\nto\nJava\nProgramming");
        System.out.printf("%s%n%s%n", "Welcome to", "Java Programming");
    }
}
