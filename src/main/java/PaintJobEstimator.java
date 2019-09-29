import java.util.Scanner;

public class PaintJobEstimator {
     public static void main(String[] args) {
         
        int totalRooms;
        double squareFeet;
        double pricePerGallon;
        double totalGallonsRequired = 0;
        double totalHoursRequired = 0;
        double totalPaintCost;
        double totalLaborCharge;
        double totalCost;
         
        Scanner userInput = new Scanner(System.in);
         
        System.out.print("Enter the total number of rooms to be painted: ");
        totalRooms = userInput.nextInt();
         
        System.out.print("Enter the price of each gallon of paint: ");
        pricePerGallon = userInput.nextDouble();
         
        for (int i = 1; i <= totalRooms; i++)
        {
        System.out.print("How many square feet of wall space are in room # " + i + ": ");
        squareFeet = userInput.nextDouble();
        totalGallonsRequired += getGallonsRequired(squareFeet);
        totalHoursRequired += getHoursRequired(squareFeet);
        }
        totalPaintCost = getTotalPaintCost(totalGallonsRequired, pricePerGallon);
        
        totalLaborCharge = getTotalLaborCharge(totalHoursRequired);
        
        totalCost = getTotalCost(totalPaintCost, totalLaborCharge);
        
        System.out.println("\nTotal number of gallons required: " + totalGallonsRequired);
        System.out.println("Total hours of labor required: " + totalHoursRequired);
        System.out.println("Total paint cost: " + totalPaintCost);
        System.out.println("Total labor charge: " + totalLaborCharge);
        System.out.println("\nTotal cost for the paint job: " + totalCost);
     }
     
    public static double getGallonsRequired(double sqft)
    {
      double gallons = 1;
      if (sqft > 115) {
        gallons = sqft / 115;
        return gallons;
      }
      else {
        return gallons;
      }
    } // end getGallonsRequired()
    
    // getHoursRequired() - hours of labor required
    public static double getHoursRequired(double sqft)
    {
      double hours = 8;
      if (sqft > 115) {
        hours *= (sqft / 115);
        return hours;
      }
      else {
        return hours;
      }
    } // end getHoursRequired()
    
    // getTotalPaintCost() - the toal cost of the paint
    public static double getTotalPaintCost(double gallons, double cost)
    {
      double result = gallons * cost;
      return result;
    } // end getTotalPaintCost()
    
    // getTotalLaborCharge() - the total labor charges
    public static double getTotalLaborCharge(double hours)
    {
      double result = hours * 18;
      return result;
    } // end getTotalLaborCharge()
    
    // getTotalCost() - the total cost of the paint job
    public static double getTotalCost(double paintCost, double laborCharge)
    {
      double result = paintCost + laborCharge;
      return result;
    } 
    
}
