/**
 * Name: Trung-Tin Huynh
 * Purpose: This program computes the time required to double an investment.
 */
public class DoubleInvestment2
{
  public static void main(String[] args)
  {
    final double RATE = 5;
    final double INITIAL_BALANCE = 10000;
    final double TARGET = 2 * INITIAL_BALANCE;
    
    double balance = INITIAL_BALANCE;
    int year = 1; //problem is here
    int loop_count = 1;
    
    //Count the years required for the investment to double
    
    while (balance < TARGET)
    {
      System.out.println("Loop #: " + loop_count++);
      double interest = balance * RATE / 100;
      balance = balance + interest;
      if (!(balance < TARGET))
        break;
      year++;
    }
    
    System.out.println("The investment doubled after " + year + " years.");
  }
}

