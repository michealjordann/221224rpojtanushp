/*
 * Activity 2.2.2
 */
public class Contact
{
  Player player = null;
  String address = "";
  
  public Contact(Player p)
  { 
    player = new Player(p.getName());
    player.setName("overwritten!");
    System.out.println("In Contact: " + player.getName());
  }
  
}
