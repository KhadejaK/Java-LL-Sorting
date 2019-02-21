import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUtil
{
   /**
    * removes every nth node in the LinkedList of Strings. 
    * Start the removal with the nth not the 0th node
    */
   public static void shrink(LinkedList<String> strings, int n) 
   {
      int x = n-1;
      while(x <= strings.size()-1)
      {    
         strings.remove(x);
         x = (x + n)-1;         
      }     
   }
   
   /**
    * return a LinkedList in which the the order of the elements is reversed.
    */
   public static LinkedList<String> reverse(LinkedList<String> strings) 
   {
      ListIterator<String> iter = strings.listIterator(strings.size());
      LinkedList<String> newList = new LinkedList<>();
      
      while (iter.hasPrevious())
      {
         String elem = iter.previous();
         newList.add(elem);
      }   
      return newList;
   }
}
