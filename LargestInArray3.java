import java.util.Scanner;

/**
 * Name: Trung-Tin Huynh
 * Purpose: The program will return the smallest and the largest number in a series
 */
public class LargestInArray3
{
  public static void main(String[] args)
  {  
    final int LENGTH = 20;
    double largest = 0, smallest = 0;
    double[] values = new double[LENGTH];
    int currentSize = 0;
        
    // Read inputs, and find the largest and the smallest number
    System.out.println("Please enter values, Q to quit:");
    Scanner in = new Scanner(System.in);
    if(in.hasNextDouble())
    {
      values[0] = in.nextDouble();
      largest = values[0];
      smallest = values[0];
      currentSize++;
      while (in.hasNextDouble() && currentSize < values.length)
      {  
        values[currentSize] = in.nextDouble();
        currentSize++;
        for (int i = 1; i < currentSize; i++)
        {
          if (values[i] > largest)
          {
            largest = values[i];
          }
          if (values[i] < smallest)
          {
            smallest = values[i];
          }
        }
      }
      
      // Print all values, marking the largest and the smallest
      for (int i = 0; i < currentSize; i++)
      {
        System.out.print(values[i]);
        if (values[i] == largest) 
        {
          System.out.print(" <== largest value");
        }if (values[i] == smallest) 
        {
          System.out.print(" <== smallest value");
        }
        System.out.println();
      }
    }else {System.out.println("No data");}
  }
}
