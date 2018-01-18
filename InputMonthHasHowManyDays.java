import java.util.*;
import java.util.Scanner;
 public class InputMonthHasHowManyDays{
  public static void main(String[] args){
   dayInMonth();   
  }
  public static void dayInMonth(){
    Scanner input = new Scanner(System.in);
      System.out.println("which month do you want to know?");
      int month = input.nextInt();
      if (month==2){
       System.out.println("Month: " + month + ". It has 28 dyas.");   
      }
      else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
       System.out.println("Month: " + month + ". It has 31 dyas.");   
      }
      else if(month==4||month==6||month==9||month==11){
       System.out.println("Month: " + month + ". It has 30 dyas.");
  }
     else{
       System.out.println("You inpit the wrong number!");
     }
 }
}


