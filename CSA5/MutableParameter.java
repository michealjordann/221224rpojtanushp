/*
 * Activity 2.2.2
 */
public class MutableParameter
{
  public static void main(String[] args) 
  {
    Player p1 = new Player("Test Name");
    
    Contact c = new Contact(p1);
    
    System.out.println("Original: " + p1.getName());
  }
}
