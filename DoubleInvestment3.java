/**
 * Name: Trung-Tin Huynh
 * Purpose: This program computes the time required to double an investment.
 */
public class DoubleInvestment3
{
  public static void main(String[] args)
  {
    final double RATE = 5;
    final double INITIAL_BALANCE = 10000;
    final double TARGET = 2 * INITIAL_BALANCE;
    
    double balance = INITIAL_BALANCE;
    int year = 0;
    int loop_count = 0;
       
    //Count the years required for the investment to double
    
    for (year = 0; balance < TARGET; year++) //for (; balance < TARGET; year++)
    {
      double interest = balance * RATE / 100;
      balance = balance + interest;
    }
    
    System.out.println("The investment doubled after " + year + " years.");
    System.out.println("Loop #: " + loop_count++);
    //System.out.println("Loop #: " + (loop_count = loop_count + 1));
  }
}

