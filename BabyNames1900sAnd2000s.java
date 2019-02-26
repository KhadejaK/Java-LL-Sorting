import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class BabyNames1900sAnd2000s
{
   public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException
   {
      Scanner in = new Scanner(new File("babynames1900s.txt"), "UTF-8");
      
      ArrayList<String> boy90s = new ArrayList<String>();
      ArrayList<String> boy00s = new ArrayList<String>();
      ArrayList<String> girl90s = new ArrayList<String>();
      ArrayList<String> girl00s = new ArrayList<String>();
      
      String line = in.nextLine();
      line = in.nextLine();
      while (in.hasNext())
      {
          line = in.nextLine(); 
          String[] name = line.split("\\t");
          boy90s.add(name[1]);
          girl90s.add(name[3]);  
      }
      in.close();
      
      in = new Scanner(new File("babynames2000s.txt"), "UTF-8");
      line = in.nextLine();
      line = in.nextLine();
      while (in.hasNext())
      {
          line = in.nextLine(); 
          String[] name = line.split("\\t");
          boy00s.add(name[1]);
          girl00s.add(name[3]);  
      }
      
      
      ArrayList<String> sameBoys = new ArrayList<>(boy90s);
      sameBoys.retainAll(boy00s);
 
      ArrayList<String> sameGirls = new ArrayList<>(girl90s);      
      sameGirls.retainAll(girl00s);
      
      Collections.sort(sameBoys);
      Collections.sort(sameGirls);
      
      for(int x=0; x < sameBoys.size(); x++)
      {
         if(x < sameGirls.size())
            System.out.printf("%-30s %-30s \n", sameBoys.get(x), sameGirls.get(x));   
         else
            System.out.printf("%-30s\n", sameBoys.get(x));
      }
         
      in.close();
   }

}
