/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  /* your code here - constructor(s) */ 
  public String getName()
 {
   return name;
 }
 
 public void setName(String x)
 {
   name = x;
 }
  
 public double getPoints()
 {
   return points;
 }
 
 public void addPoints(int newPoints){
   points = points + newPoints;
 }
 
  public Player(){
  
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter Your Name");
  name = sc.nextLine();
  points = 0;
  System.out.println("Welcome " + name + "!");

  }

  public Player(String inputName){
  
  name = inputName;
  points = 0;
  System.out.println("Welcome " + name + "!");

  }
}
