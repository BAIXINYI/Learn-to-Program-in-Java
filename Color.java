import java.util.*;
import java.util.Scanner;
 public class Color{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      System.out.println("What color do you want?");
      String color = input.next();
      if (color.equals("R")){
       System.out.println("You have chosen Red.");   
      }
      else if(color.equals("G")){
       System.out.println("You have chosen Green.");   
      }
      else if(color.equals("B")){
       System.out.println("You have chosen Blue.");
  }
     else{
       System.out.println("Unknown color: " + color );
     }
 }
}







