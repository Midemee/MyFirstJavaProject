//This exercise is from Chapter Two
//This program will calculate the product of two integers

import java.util.Scanner;
public class Exercise {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the first integer: ");
  int x = input.nextInt();
  System.out.print("Enter the second integer: ");
  int y = input.nextInt();
  System.out.print("Enter the third integer: ");
  int z = input.nextInt();
  int result = x * y * z;
  System.out.printf("%s%d%n", "Product is ", result);
  System.out.printf("Product is = %d%n", result);
  System.out.println();

  System.out.println("1 2 3 4");
  System.out.print("1 2 3 4");
  System.out.printf("%n%d %d %d %d%n", 1 , 2 , 3 , 4);
  System.out.println();

  System.out.print("Enter first integer: ");
  int a = input.nextInt();
  System.out.print("Enter second integer: ");
  int b = input.nextInt();
  int resultA = a * a;
  int resultB = b * b;
  int sum = resultA + resultB;
  int minus = resultA - resultB;
  System.out.println(resultA);
  System.out.println(resultB);
  System.out.println(sum);
  System.out.println(minus);
  System.out.println();

  System.out.print("Enter an integer: ");
  int userInput = input.nextInt();
  int squared = userInput * userInput;
  if(userInput > 100 && squared > 100) {
     System.out.println("Greater than 100");
} else if (userInput == 100 && squared == 100) {
     System.out.println("Equals to 100");
} else if (userInput < 100 && squared < 100) {
     System.out.println("Less than 100");
} else {
     System.out.println("Not equal to 100");
}
System.out.println();

System.out.print("Enter first number: ");
int d = input.nextInt();
System.out.print("Enter second number: ");
int e = input.nextInt();
System.out.print("Enter third number: ");
int f = input.nextInt();
int addition = d + e + f;
int multiply = d * e * f;
int average = (d + e + f)/ 3;
System.out.println(addition);
System.out.println(multiply);
System.out.println(average);

if (d < e && d < f) {
System.out.printf("The smallest number is d= %d%n", d);
} else if (e < d && e < f) {
System.out.printf("The smallest number is e= %d%n",e);
} else {
System.out.printf("The smallest number is f= %d%n", f);
}

if (d > e && d > f) {
System.out.printf("The largest number is d= %d%n", d);
} else if (e > d && e > f) {
System.out.printf("The largest number is e= %d%n",e);
}else {
System.out.printf("The largest number is f= %d%n", f);
}
System.out.println();



    System.out.printf("   ****%n  ******%n*******%n  ******%n   ****%n");
    System.out.println();

    System.out.println("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.println("**");
    System.out.println("**");
    System.out.println();


    System.out.print("*");
    System.out.print("***");
    System.out.print("*****");
    System.out.print("****");
    System.out.println("**");
    System.out.println();

    System.out.print("*");
    System.out.println("***");
    System.out.println("*****");
    System.out.print("****");
    System.out.println("**");
    System.out.println();

    System.out.printf("%s%n%s%n%s%n%s%n", "    *", "  ***", "*****", "  ***", "    *");
    System.out.println();
     
    System.out.println("********");
    System.out.println(" ********");
    System.out.println("********");
    System.out.println(" ********");
    System.out.println("********");
    System.out.println(" ********");
    System.out.println("********");
    System.out.println(" ********");
    System.out.println();

    System.out.println("*********      ***        *          *");
    System.out.println("*       *    *     *     ***        * *");
    System.out.println("*       *   *       *   *****      *   *");
    System.out.println("*       *   *       *     *       *     *");
    System.out.println("*       *   *       *     *      *       *");
    System.out.println("*       *   *       *     *       *     *");
    System.out.println("*       *   *       *     *        *   *");
    System.out.println("*       *    *     *      *         * *");
    System.out.println("*********      ***        *          *");
    System.out.println();

    int one = 24;
    int two = 35;
    int three = 18;
    int four = 72;
    int five = 46;

    if(one > two && one > three && one > four && one > five) {
    System.out.println("One is the largest Number");
} else if(two > one && two > three && two > four && two > five) {
    System.out.println("Two is the largest number");
} else if (three > one && three > two && three > four && three > five) {
    System.out.println("Three is the largest number");
} else if (four > one && four > two && four > three && four > five) {
    System.out.println("Four is the largest number");
} else {
    System.out.println("Five is the largest number");
}

    if(one < two && one < three && one < four && one < five) {
    System.out.println("One is the smallest Number");
} else if(two < one && two < three && two < four && two < five) {
    System.out.println("Two is the smallest number");
} else if (three < one && three < two && three < four && three < five) {
    System.out.println("Three is the smallest number");
} else if (four < one && four < two && four < three && four < five) {
    System.out.println("Four is the smallest number");
} else {
    System.out.println("Five is the smallest number");
}
    System.out.println();

  int cat = 24;
  int dog = 56;
  int bird = 35;

if (cat % 3 == 0) {
    System.out.println("Cat is divisible by 3");
} else {
    System.out.println("Dog is not divisible by 3");
}

if (dog % 3 == 0) {
   System.out.println("Dog is divisible by 3");
} else {
   System.out.println("Dog is not divisible by 3");
}

if (bird % 3 == 0) {
   System.out.println("Brid is divisible by 3");
} else {
    System.out.println("Bird is not divisible by 3");
}
    System.out.println();

   int number1 = 8;
   int number2 = 4;
   int tripled = number1 * 3;
   int doubled = number2 * 2;
   
   if (tripled % doubled == 0) {
   System.out.println("Tripled is a multiple of double");
} else {
   System.out.println("Tripled is not a multiple of double");
}


}

}