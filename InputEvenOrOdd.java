import java.util.*;
import java.util.Scanner;
public class InputEvenOrOdd{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("What is your number?");
        int num = input.nextInt();
	System.out.print( num + " is ");
        if(num % 2 == 0){
            System.out.println("even");
        }else if(num % 2 == 1){
            System.out.println("odd");
        }
            
    }
}
