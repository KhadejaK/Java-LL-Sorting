import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryCart
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String fileName = "items.txt"; //SUB "items2.txt"
      
      Scanner in = new Scanner(new File(fileName), "UTF-8"); 
      
      ArrayList<String> name  = new ArrayList<String>();
      ArrayList<Double> price = new ArrayList<Double>();
      ArrayList<Double> quant = new ArrayList<Double>();
      
      String line = in.nextLine();
      while(in.hasNext())
      {
         String wholeName = in.next();
         while(!in.hasNextDouble())
         {        
            line = in.next();
            wholeName += " " + line;
         }
         name.add(wholeName);
         while(in.hasNextDouble())
         {
            double pricee = in.nextDouble();
            price.add(pricee);
            
            double quantit = in.nextInt();
            quant.add(quantit);
         }
      }

      double extPrice = 0;
      double total = 0;
      for(int x=0; x < name.size(); x++)
      {
         extPrice = price.get(x) * quant.get(x);
         total += extPrice;
         System.out.printf("%-20s", name.get(x));
         System.out.printf("%8.2f", price.get(x));
         System.out.printf("%8.0f", quant.get(x));
         System.out.printf("%8.2f \n", extPrice);
      }
      System.out.printf("Total: $%.2f", total);

      in.close();      
   }
}