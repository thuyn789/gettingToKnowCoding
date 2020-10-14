import java.util.Scanner;
/**
 Name: Trung-Tin Huynh
 Purpose: Sum and difference
*/
public class InputOutputEx
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 1st integer: ");
    int x = in.nextInt();
    //int x = in.nextDouble(); error
    //double x = in.nextInt(); no error
    //int x = in.nextInt(); correct for use
    //double x = in.nextDouble(); correct for use
    System.out.print("Enter 2nd integer: ");
    int y = in.nextInt();
    int sum = x + y;
    System.out.println("The sum of 2 ingeters is " + sum);
    
    //Page 46 example
    int a = 10;
    int b = 4;
    int c = 9;
    //double average = (a+b+c)/3; //error 
    
    //double d = a + b + c; //Solution 1
    //double average = d/3; //Solution 1
    
    //double average = (a + b + c)/3.0; //Solution 2
    
    double average = (double)(a + b + c) / 3; //Solution 3 //Casting number
    
    System.out.println("Average score: " + average);
  }
}