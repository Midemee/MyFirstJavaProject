import java.util.Scanner;
//Create a scanner to obtain two number inputs from the command window and displays their sum
public class Scan {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter first integer: ");
//        int number1 = input.nextInt();
//
//        System.out.print("Enter second integer: ");
//        int number2 = input.nextInt();
//
//        int sum = number1 + number2;
//        System.out.printf("Sum is %d%n", sum);
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scanner.nextLine();
//
//        System.out.println("Please enter your age");
//        int age = scanner.nextInt();
//
//        System.out.println("What is your Gpa");
//        double gpa = scanner.nextDouble();
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + "years old");
//        if (gpa <= 4.0) {
//            System.out.println("Ooops! Your Gpa: " + gpa + " is not eligible to enrol");
//        }
//        else{
//            System.out.println("Congratulations,Your Gpa: " + gpa + " is eligible to enrol");
//        }
//        scanner.close();

        //Calculate the area of a rectangle
//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        Scanner rectangle = new Scanner(System.in);
//        System.out.print("Enter the width: ");
//       width = rectangle.nextDouble();
//
//        System.out.print("Enter the height: ");
//        height = rectangle.nextDouble();
//
//        area = width * height;
//
//        System.out.println("The area of the rectangle is " + area + "cm");
//
//        rectangle.close();

        Scanner user = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = user.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = user.nextInt();

        if (number1 == number2) {
            System.out.printf("%d == %d%n", number1, number2);
        }
        if (number1 != number2) {
           System.out.printf("%d != %d%n", number1, number2);
        }
        if (number1 < number2) {
            System.out.printf("%d < %d%n", number1, number2);
        }
        if (number1 > number2) {
            System.out.printf("%d > %d%n", number1, number2);
        }
        if (number1 <= number2) {
            System.out.printf("%d <= %d%n", number1, number2);
        }
        if (number1 >= number2) {
            System.out.printf("%d >= %d%n", number1, number2);
        }

    }
}

