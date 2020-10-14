/**
 Name: Trung-Tin Huynh
 P1.3 page 25
 Purpose: To test the functions of For Loop, While Loop, and Do Loop
 */
public class Multiplication
{
  public static void main (String[] args)
  {
    int z = 1*2*3*4*5*6*7*8*9*10;
    int t = 1+2+3+4+5+6+7+8+9+10;
    System.out.println("1x2x3x4x5x6x7x8x9x10 = " + z);
    System.out.println("1x2x3x4x5x6x7x8x9x10 = " + t);
    System.out.println();
    System.out.println("For Loop - Counter Loop");
    int x = 0, y = 1;
    for (int i = 1; i <= 10; i++)
    {
      x += i;
      y *= i;
    }
    System.out.println("1+2+3+4+5+6+7+8+9+10 = " + x);
    System.out.println("1x2x3x4x5x6x7x8x9x10 = " + y);
    System.out.println();
    System.out.println("While Loop - Event Loop");
    int a = 0, b = 1, m = 1;
    while (m <= 10)
    {
      a += m;
      b *= m;
      m++;
    }
    System.out.println("1+2+3+4+5+6+7+8+9+10 = " + a);
    System.out.println("1x2x3x4x5x6x7x8x9x10 = " + b);
    System.out.println();
    System.out.println("Do Loop");
    int f = 0, g = 1, h = 1;
    do 
    {
      f += h;
      g *= h;
      h++;
    }
    while (h <= 10);
    System.out.println("1+2+3+4+5+6+7+8+9+10 = " + f);
    System.out.println("1x2x3x4x5x6x7x8x9x10 = " + g);
  }
}