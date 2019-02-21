public class RosterTester
{
   public static void main(String[] arg)
   {
      Roster myClass = new Roster();
      
      System.out.println(myClass.getNames());
      System.out.println("Expected: []");
      
      myClass.remove("Thomas");
      System.out.println(myClass.getNames());
      System.out.println("Expected: []");
      
      myClass.add(new Student("Carlos", 3.85));
      myClass.add(new Student("Predeep", 3.55));
      myClass.add(new Student("Aman", 3.5));
      myClass.add(new Student("Amy", 3.95));
      myClass.add(new Student("Yen", 3.5));
      
      System.out.println(myClass.getNames());
      System.out.println("Expected: [Aman, Amy, Carlos, Predeep, Yen]");
      
      myClass.add(new Student("Predeep", 2.0));
      myClass.add(new Student("James", 3.6));
      
      System.out.println(myClass.getNames());
      System.out.println("Expected: [Aman, Amy, Carlos, James, Predeep, Predeep, Yen]");
      
      myClass.remove("Fred");
      myClass.remove("Predeep");
      System.out.println(myClass.getNames());
      System.out.println("Expected: [Aman, Amy, Carlos, James, Predeep, Yen]");
      
   }
}