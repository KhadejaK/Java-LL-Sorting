import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RectangleSorter
{ 
   public static void sortByArea(ArrayList<Rectangle> list)
   {
      class sortByAreaInner implements Comparator<Rectangle>
      {
          public int compare(Rectangle r1, Rectangle r2) 
          {
             double area1 = r1.getWidth() * r1.getHeight();
             double area2 = r2.getWidth() * r2.getHeight();
             return Double.compare(area1, area2);
          }
      }
      
      Collections.sort(list, new sortByAreaInner() );
   }

   public static void sortByDescendingPerimeter(ArrayList<Rectangle> list)
   {
      class sortByDescPerim implements Comparator<Rectangle>
      {
          public int compare(Rectangle r1, Rectangle r2) 
          {
             double prim1 = r1.getWidth()*2 + r1.getHeight()*2;
             double prim2 = r2.getWidth()*2 + r2.getHeight()*2;
             return Double.compare(prim2, prim1);
          }
      }
      
      Collections.sort(list, new sortByDescPerim() );
   }
}
