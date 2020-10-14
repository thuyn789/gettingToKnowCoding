//Name: Trung-Tin Huynh
//Homework question 2
/**
 * This program computes the volume (in liters) of a six-pack of soda cans and the total volume of a six-pack and a two-liter bottle.
 */
public class Volume1
{
  public static void main(String[] args)
  {
    final int calPerLiter = 20; //Calories in 1 litter
    int cansPerPack = 6;
    final double CAN_VOLUME = 0.355; //Liters in a 12-ounce can
    double totalVolume = cansPerPack * CAN_VOLUME;
        
    System.out.print("A six-pack of 12-ounce cans contains ");
    System.out.print(totalVolume);
    System.out.println(" litter. ");
    
    final double BOTTLE_VOLUME = 2; //Two-liter bottle
    
    totalVolume = totalVolume + BOTTLE_VOLUME;
    double totalCal = calPerLiter * totalVolume;
    
    System.out.print("A six-pack and a two-liter bottle contain ");
    System.out.print(totalVolume);
    System.out.println(" liters. ");
    
    System.out.print("The total calorie of a six-pack and a two-liter bottle contain ");
    System.out.print(totalCal);
    System.out.println(". ");
    
    String x="dogday";

    String y="okey";

    System.out.println("output=" + x.substring(y.length()/2, y.length()));
  }
}
