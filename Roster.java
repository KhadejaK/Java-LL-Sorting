import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Comparator;

public class Roster
{
   private LinkedList<Student> students; 
   
   public Roster()
   {
      students = new LinkedList<Student>();
   }
   
   /*
    * adds the Student to the LinkedList.
    * The Students are maintained in alphabetical order by name
    */
   public void add(Student s)
   {
      students.add(s);
      
      class addInner implements Comparator<Student>
      {
          public int compare(Student s1, Student s2) 
          {
             String name1 = s1.getName();
             String name2 = s2.getName();
             return name1.compareTo(name2);
          }
      }
      
      Collections.sort(students, new addInner());
   }
    
   /*
    * removes the first Student with the given name
    */
   public void remove(String name) 
   {
      if (students.size() != 0)
      {
         ListIterator<Student> iter = students.listIterator();
         int index = -1;
         while(iter.hasNext())
         {
            index++;
            String namee = iter.next().getName();
            if(namee.equals(name))
            {
               students.remove(index);  
               break;
            }         
         }      
      }
      
   }
   
   /*
    * returns an ArrayList of Strings containing the names of all the Students
    */
   public ArrayList<String> getNames() 
   {
      ArrayList<String> names = new ArrayList<String>();
      
      for(Student s: students)
         names.add(s.getName());
      
      return names;
   }
}
