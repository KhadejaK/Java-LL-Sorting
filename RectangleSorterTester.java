import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;

public class RectangleSorterTester
{

   public static void main(String[] args)
   {
      ArrayList<Rectangle> recs = new ArrayList<>();
      recs.add(new Rectangle(0, 0, 10, 10));
      recs.add(new Rectangle(0, 0, 10, 5));
      recs.add(new Rectangle(0, 0, 10, 15));
      
      RectangleSorter.sortByArea(recs);
      System.out.println("Area: " + recs);
      System.out.println("Expected: [java.awt.Rectangle[x=0,y=0,width=10,height=5], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=10], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=15]]");
      recs.add(new Rectangle(0, 0, 30, 1));
      
      RectangleSorter.sortByArea(recs);
      System.out.println("Area: " + recs);      
      System.out.println("Expected: [java.awt.Rectangle[x=0,y=0,width=30,height=1], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=5], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=10], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=15]]");

      recs.add(new Rectangle(0, 0, 20, 4));
      RectangleSorter.sortByDescendingPerimeter(recs);
      System.out.println("Perimeter: " + recs); 
      System.out.println("Expected: [java.awt.Rectangle[x=0,y=0,width=30,height=1], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=15], "
            + "java.awt.Rectangle[x=0,y=0,width=20,height=4], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=10], "
            + "java.awt.Rectangle[x=0,y=0,width=10,height=5]]");
   }

}
