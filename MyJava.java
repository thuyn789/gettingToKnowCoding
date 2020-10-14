//import java.util.Scanner;

/**
 This program reads a sequence of values and prints them, marking the largest value.
 */
public class MyJava
{
  public static void main(String[] args)
  {  
    System.out.println("My program...");
    System.out.println("The first value: " + args[0]);
    System.out.println("The first value: " + args[1]);
    //int a = args[0] + args[1]; values are stored in args are String. Use Integer.parseInt(args[i]) to convert to integer
    int a = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
    System.out.println("Output Integer.parseInt(args[0]) + Integer.parseInt(args[1]): " + a);
    
    for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++)
    {
      System.out.print(i + "  ");
    }
    
  }
}