import java.util.*;
import java.util.Scanner;
public class OddsAndEvens {
    
    public static void main(String args[]) {
        
     // PickOddOrEven
        Scanner input = new Scanner(System.in);
        System.out.println("Let\'s play a game called \"Odds and Evens\"");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        int oddOrEvenuser = 0;
        char choice = input.next().charAt(0);
            if(choice == 'O'){
                oddOrEvenuser = 1;
                System.out.println(name + " has picked odds! The computer will be evens.");
            }   
            else if(choice == 'E'){
                System.out.println(name + " has picked even! The computer will be odds.");
                oddOrEvenuser = 0;
            }
            else{
                System.out.println("Input wrong!");
            }
        System.out.println("------------------------------------------------\n");
    

     // PlayTheGame
        System.out.println("How many \"fingers\" do you put out?");
        int usernum = input.nextInt();
        Random rand = new Random();
        int computernum  = rand.nextInt(6);
        System.out.println("The computer plays " + computernum +  " \"fingers\"");
        System.out.println("------------------------------------------------\n");
        int sum = usernum + computernum;
        System.out.println("userNumber + computerNumber = sum :" + usernum + " + " + computernum + " = " + sum);
        int oddOrEvensum;    
        if(sum % 2 == 0){
        System.out.println(sum + " is ... even!");  
        oddOrEvensum = 0;
        }
        else{
        System.out.println(sum + " is ... odd!");    
        oddOrEvensum = 1;
        }
        System.out.println("------------------------------------------------\n");
    
     //WhoWon
        if(oddOrEvensum == oddOrEvenuser){
            System.out.println("That means " + name + " won!");
        }
        else{
            System.out.println("That means " + name + " fails!"); 
        }
    }
}


