import java.util.Scanner;
/**
 Name: Trung-Tin Huynh
 Purpose: Demonstrate "method" 
 */
public class MyMethodExercise
{
  public static void main(String[] args) //this is a "main" method
  {
    printHeading();//This is the way to call a void method
    //String name = "John"; ////Variable Scope 1
    //String msg = "Hello";
    //String msg = printMsg();
    //System.out.println(msg + printMsg2());
    //int sum = 0, x = 3, y = 4, subtract = 0;
    //sum = my_add(x,y); //this statement call "my_add" method
    //System.out.println("sum = " + sum);
    //subtract = my_subtract (x,y); //method name can be as same as variable name
    //System.out.println("subtract = " + subtract);
    int x = 0, y = 0;
    final Scanner g = new Scanner(System.in);
    System.out.print("Enter x: ");
    x = g.nextInt();
    System.out.print("Enter y: ");
    y = g.nextInt();
    //my_for_loop(x,y);
    //my_while_loop(x,y,name); //Variable Scope 2
    my_do_loop(x,y);
  }
  public static String printMsg() //printMsg: method name //This method will return something a string
  {
    return "Hellooo";
  }//this whole thing is called a method //This is how to define a method
  public static String printMsg2() //printMsg2: method name //This method will return something a string
  {
    return ", Java.";
  }//this is another method //This is how to define a method
  public static void printHeading()//printHeading: method name //"void" method don't need "return" inside //This is a "void" method
  {
    System.out.println("My code:"); //"void" method will not return anything
  }//"void" can be called in any method, but cannot be called like this statement System.out.print(printHeading());
  public static int my_add(int x, int y) //This method will return an integer //what inside of "( )" is called parameters or arguments
  {              //This method will accept 2 integers
    return x + y; //this statement will return a sum of x and y
  }//This is how to define a method
  public static int my_subtract (int x, int y)
  {
    return x - y;
  }//This is how to define a method
  public static void my_for_loop(int a, int b)
  {
    for(int i = a; i <= b; i++)
    {
      System.out.print(i + ";");
    }
  }
  public static void my_while_loop(int a, int b, String name) ////Variable Scope 2
  {
    //String name = "John"; //Variable Scope 1
    if (a > b)
    {
      int i = b;
      b = a;
      a = i;
    }
    while (a <= b)
    {
      System.out.print(a + ";");
      System.out.print(name + ";");
      a++;
    }
  }
  public static void my_do_loop(int a, int b)
  {
    do
    {
      System.out.print(a + ";");
      a++;
    }
    while(a <= b);
  }
}