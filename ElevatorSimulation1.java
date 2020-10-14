import java.util.Scanner;
/**
 Name: Trung-Tin Huynh
 Purpose: This program simulates an elevator panel that skips the 13th floor.
 */
public class ElevatorSimulation1
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Floor: ");
    int floor = in.nextInt();
    
    // Adjust floor if necessary
    int actualFloor = 1;
    if (floor > 13)
    {
      //actualFloor = floor - 1;
      actualFloor--;
    }
    else
    {
      actualFloor = floor;
    }
    System.out.println("The elevator will travel to the actual floor " + actualFloor);
    
    System.out.println();
    int x = 1, x1 = 1;
    while (x <=10)
    {
      //x++;
      x1*=x;
      x++;
      //x2*=x;
    }
    System.out.println("sum of 10 first digit = " + x1);
    //System.out.println("Multipication of 10 first digit = " + x2);
  }
}