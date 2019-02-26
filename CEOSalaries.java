import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CEOSalaries
{
   public static void main(String[] args)
   {
      try
      {
         File inputFile = new File(args[0]);
         Scanner in = new Scanner(inputFile, "UTF-8");
         
         ArrayList<String> ticker = new ArrayList<String>();
         ArrayList<String> name = new ArrayList<String>();
         ArrayList<Integer> comp = new ArrayList<Integer>();
         
         String line = in.nextLine();
         while(in.hasNext())
         {
            line = in.next();
            ticker.add(line);
            
            line = in.nextLine();
            String[] split = line.split("\\t");
            name.add(split[2]);
            
            String nums = split[4].replaceAll("[$,]", "");
            comp.add(Integer.parseInt(nums));
            
         }
         double average = 0;
         for(int x=0; x < name.size(); x++)
         {
            System.out.printf("%s: %s $%,d\n", ticker.get(x), name.get(x), comp.get(x));
            average += comp.get(x);
         }
         System.out.printf("Average salary: $%,.2f\n", average/comp.size());
          
         in.close();
      }      
      catch(FileNotFoundException e )
      {
          System.out.println("No such file: bad_file.txt");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("Usage: java CEOSalaries infile");
      }
   }
}
