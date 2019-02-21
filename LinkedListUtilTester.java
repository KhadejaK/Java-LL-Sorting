import java.util.LinkedList;

public class LinkedListUtilTester
{

   public static void main(String[] args)
   {
      LinkedList<String> list = new LinkedList<>();
      
      list.add("1");
      list.add("2");
      list.add("3");
      list.add("4");
      list.add("5");
      list.add("6");
      list.add("7");
      list.add("8");
      list.add("9");
      list.add("10");
      list.add("11");
      list.add("12");
      list.add("13");
      list.add("14");
      list.add("15");
      
      LinkedListUtil.shrink(list, 3); 
      System.out.println(list);
      System.out.println("Expected: [1, 2, 4, 5, 7, 8, 10, 11, 13, 14]");
      
      System.out.println(LinkedListUtil.reverse(list));
      System.out.println("Expected: [14, 13, 11, 10, 8, 7, 5, 4, 2, 1]");
      
      list.clear();
      list.add("uno");
      list.add("dos");
      list.add("tres");
      list.add("cuatro");
      list.add("cinco");
      list.add("seis");
      list.add("siete");
      list.add("ocho");
      list.add("nueve");
      list.add("dies");
      list.add("once");
      list.add("doce");
      list.add("trece");
      list.add("catorce");
      list.add("quince");
      
      LinkedListUtil.shrink(list, 4); 
      System.out.println(list);
      System.out.println("Expected: [uno, dos, tres, cinco, seis, siete, nueve, dies, once, trece, catorce, quince]");

      System.out.println(LinkedListUtil.reverse(list));
      System.out.println("Expected: [quince, catorce, trece, once, dies, nueve, siete, seis, cinco, tres, dos, uno]");
   }
}