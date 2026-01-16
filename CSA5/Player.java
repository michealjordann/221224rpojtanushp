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
  public Player(){
    System.out.println("Welcome, Enter your name:");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Name");
    name = sc.nextLine();
    points = 0;
    System.out.print("Welcome" + name);


  }


  public Player(String inputName){


    name = inputName;
    points = 0;
    System.out.print("Welcome" + name);
  }
 


  /* your code here - accessor(s) */
public String getName(){
  return name;
}
public int points(){
  return points;
}


  /* your code here - mutator(s) */
}
