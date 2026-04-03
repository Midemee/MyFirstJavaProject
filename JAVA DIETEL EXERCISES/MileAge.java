import java.util.Scanner;
public class MileAge{
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 int totalMiles = 0;
 int totalGallons = 0;
 int tripCount = 0;

 System.out.print("Enter the miles driven or -1 to quit: ");
 int miles = input.nextInt();

 while(miles != -1) {
   System.out.print("Enter the gallons: ");
   int gallons = input.nextInt();
   double mpg = (double) miles / gallons;
   totalMiles += miles;
   totalGallons += gallons;
   tripCount ++;
   System.out.printf("The total number of miles per gallon is %.2f%n", mpg);
   double combinedMpg = (double) totalMiles / totalGallons;
   System.out.printf("The combined mile per gallon is %.2f%n", combinedMpg);
   
   System.out.print("Enter the miles driven or -1 to quit: ");
   miles = input.nextInt();
 }

 if(tripCount == 0) {
   System.out.println("No trips was recorded");
}
else {
   System.out.printf("The total trips is: %d%n", tripCount);
   System.out.printf("The total miles driven is: %d%n", totalMiles);
   System.out.printf("The total gallons used is: %d%n", totalGallons);
   System.out.printf("The final combined mile per gallon is: %.2f MPG %n", (double) totalMiles / totalGallons);
}
}
}