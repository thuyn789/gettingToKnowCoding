import java.util.Scanner;
/**
 * Name: Trung-Tin Huynh
 * Purpose: The program will return the smallest and the largest number in a series
 */
public class LargeSmall
{
  public static void main(String[] args)
  {
    double largest = 0, smallest = 0;
    final Scanner in = new Scanner(System.in);
    System.out.print("Please enter your numbers, -1 to finish: ");
    double input = in.nextDouble();
    if(input != -1)
    {
      largest = input; smallest = input;
      while(in.hasNextDouble())
      {
        input = in.nextDouble();
        System.out.println(input);
        if(input != -1)
        {
          if (input > largest)
          {
            largest = input;
          }
          if (input < smallest)
          {
            smallest = input;
          }
        }else {break;}
      }
      System.out.println("Largest number is: " + largest);
      System.out.println("Smallest number is: " + smallest);
    }
    else {System.out.println("No data");}
  }
}

