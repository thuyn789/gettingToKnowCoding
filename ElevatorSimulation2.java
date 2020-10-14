import java.util.Scanner;
/**
 Name: Trung-Tin Huynh
 Purpose: This program simulates an elevator panel that skips the 13th floor.
 */
public class ElevatorSimulation2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Floor: ");
    int floor = in.nextInt();
    
    // Adjust floor if necessary
    int actualFloor = floor;
    if (floor <= 30)
    {
      if (floor >13)
      {
        actualFloor--;
      }
      System.out.println("The elevator will travel to the actual floor " + actualFloor);
    }
    else
    {
      actualFloor--;
      System.out.println("Sorry! We do not have actual floor " + actualFloor);
    }
  }
}