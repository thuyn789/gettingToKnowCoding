import java.util.Scanner;
/**
 * Name: Trung-Tin Huynh
 * Purpose: This program will sort a list of number increaseingly
 */
public class SortNumber
{
  public static void main(String[] args)
  {
    final int LENGTH = 10;
    double[] list = new double[LENGTH];
    int currentPosition = 0;
    System.out.print("Enter 10 numbers or less that need to be sorted, q to finish: ");
    Scanner in = new Scanner(System.in);
    
    if(in.hasNextDouble())
    {
      while(in.hasNextDouble() && currentPosition < list.length)
      {
        list[currentPosition] = in.nextDouble();
        currentPosition++;
      }
      for(int i = currentPosition - 1; i >= 0; i--)
      {
        double max = list[i];
        for(int j = 0; j < i; j++)
        {
          if(max <= list[j])
          {
            max = list[j];
            list[j] = list[i];
          }
          list[i] = max;
        }
      }
      for(int i = 0; i < currentPosition; i++)
      {
        System.out.print(list[i]+ "   ");
      }
    }else{System.out.println("No data");}
  }
  /*
   private
   {}
   protected
   {}
   */
}