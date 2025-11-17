import java.util.Scanner;

public class SentinelSum {
   public static void main(String[] args) {
      Scanner scan =  new Scanner(System.in);
      
      System.out.print("Please enter a number to avergage in or -1 to stop: ");
      int number = scan.nextInt();
      int sum = 0;
      
      while (number != -1) {
         sum += number;
         System.out.print("Please enter a number to avergage in or -1 to stop: ");
         number = scan.nextInt();
      }
      System.out.println("Sum is " + sum);
   }
}