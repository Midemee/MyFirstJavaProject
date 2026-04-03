//Using the Counter-Controlled Iteration (While loops)
/*import java.util.Scanner;

public class Study{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
 int total = 0;
 int gradeCounter = 1;
 while(gradeCounter <= 5) {
System.out.print("Enter the grade: ");
int grade = input.nextInt();
total = total + grade;
gradeCounter = gradeCounter + 1;
}
int average = total / 5;
System.out.printf("%nThe total of all grades are: %d%n", total);
System.out.printf("The average is %d", average);

}
}*/

//Using the Sentinel-controlled Iteration (While loop)
/*import java.util.Scanner;
public class Study{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 0;

System.out.print("Enter grade or -1 to quit: ");
int grade = input.nextInt();

while(grade != -1){
 total = total + grade;
 gradeCounter += 1;

System.out.print("Enter grade or -1 to exit ");
grade = input.nextInt();
}

if(gradeCounter != 0) {
//Use the unary cast operator to create temporary floating-point copy of its operand total... the int gradecounter will go through an implicit conversion or promotion to double
double average = (double) total/gradeCounter;
System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
System.out.printf("The class average is %.2f", average);
} else {
System.out.println("No grade were entered");
}

}
}*/

/*import java.util.Scanner;
public class Study{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int passes = 0;
int failures = 0;
int studentCounter = 1;

while(studentCounter <= 10) {
System.out.print("Enter the exam result (1 = pass, 2 = fail): ");
int examResult = input.nextInt();

  if (examResult == 1) {
  passes += 1;
  }
  else {
  failures += 1;
  } 
studentCounter += 1;
}

System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

if (passes > 8) {
System.out.println("Bonus to the instructor!");
}
}
}*/

//Re-factored code, checks for invalid input by user
/*import java.util.Scanner;
public class Study{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int passes = 0;
int failures = 0;
int studentCounter = 1;

while (studentCounter <= 10) {
System.out.print("Enter the exam result (1 = pass, 2 = fail): ");
int examResult = input.nextInt();
  while (examResult !=1 && examResult !=2) {
   System.out.print("Not a valid exam result! Enter the exam result (1 = pass, 2 = fail): ");
   examResult = input.nextInt();
  }

  if (examResult == 1) {
  passes += 1;
  }
  else {
  failures += 1;
  } 

studentCounter += 1;
}

System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

if (passes > 8) {
System.out.println("Bonus to the instructor!");
}
}
}*/

//Chapter 5 Exercise 4.16
public class Study{
public static void main(String[] args) {

int x = -2;
int total = 0;

while (x <= 10) {
int y = x + 2;
x++;
total += y;
System.out.printf("Y is: %d and total is %d\n", y, total);
}

}
}

