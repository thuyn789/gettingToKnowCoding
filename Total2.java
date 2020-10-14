import java.io.File; //process input file
import java.io.FileNotFoundException; //process input file
import java.io.PrintWriter; //process output file
import java.util.Scanner;

/**
 This program reads a file with numbers, and writes the numbers to another
 file, lined up in a column and followed by their total. 
 */
public class Total2
{
  public static void main(String[] args) throws FileNotFoundException
  {     
    // Prompt for the input and output file names
    
    Scanner console = new Scanner(System.in); //Scanner variable "console"
    System.out.print("Input Fall file: ");
    String inputFileFall = console.next(); //String variable "inputFileName"
    System.out.print("Input Spring file: ");
    String inputFileSpring = console.next();
    System.out.print("Output file: ");
    String outputFileName = console.next(); //String variable "outputFileName"
    
    // Construct the Scanner and PrintWriter objects for reading and writing
    
    File inputFile = new File(inputFileFall); //File variable "inputFile"
    File inputFile1 = new File(inputFileSpring);
    Scanner in = new Scanner(inputFile);
    Scanner in1 = new Scanner(inputFile1);
    PrintWriter out = new PrintWriter(outputFileName);
    
    // Read the input and write the output
    
    double total = 0, average = 0, total1 = 0;
    int count = 0;
    
    while (in.hasNextDouble())
    {
      double value = in.nextDouble();
      out.printf("%15.2f\n", value);
      total += value;
      count++;
    }
    while (in1.hasNextDouble())
    {
      double value = in1.nextDouble();
      out.printf("%15.2f\n", value);
      total1 += value;
      count++;
    }
    average = (total+total1)/count;
    out.printf("Total: %8.2f\n", total); //format output: 8 spaces - 2 decimals - f:floating point numbers - \n:create a new line
    out.printf("Average: %8.2f\n", average);
    out.printf("Average: %10.5f\n", average);
    
    in.close(); //always close the bridge "in"
    in1.close();
    out.close(); //always close the bridge "out"
  }
}
