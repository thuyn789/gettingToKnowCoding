import java.util.Scanner;
/**
 * Name: Trung-Tin Huynh
 * Purpose: The program will return the smallest and the largest number in a series
 */
public class LargeSmall2
{
  public static void main(String[] args)
  {
    double largest = 0, smallest = 0;
    final Scanner in = new Scanner(System.in);
    System.out.print("Please enter your numbers, Q to finish: ");
    if(in.hasNextDouble())
    {
      double input = in.nextDouble();
      largest = input; smallest = input;
      System.out.println(input);
      while(in.hasNextDouble())
      {
        input = in.nextDouble();
        System.out.println(input);
        if (input > largest)
        {
          largest = input;
        }
        if (input < smallest)
        {
          smallest = input;
        }
      }
      System.out.println("Largest number is: " + largest);
      System.out.println("Smallest number is: " + smallest);
    }else {System.out.println("No data");}
  }
}
