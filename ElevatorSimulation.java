import java.util.Scanner;
/**
 Name: Trung-Tin Huynh
 Purpose: This program simulates an elevator panel that skips the 13th floor and number of people in the elevator
 */
public class ElevatorSimulation
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter floor: ");
    int floor = in.nextInt();
    System.out.print("Enter number of people: ");
    int numberOfPeople = in.nextInt();
    
    // Adjust floor if necessary
    
    int actualFloor = 1;
    if (numberOfPeople <= 10)
    {
      if (floor > 13)
      {
        actualFloor = floor - 1;
      }
      else
      {
        actualFloor = floor;
      }
      System.out.println("The elevator will travel to the actual floor " + actualFloor);
    }
    else
    {
      System.out.println("Over capacity!");
    }
  }
}