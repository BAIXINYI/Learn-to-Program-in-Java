
import java.util.*;
public class RecursiveCombineString{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter your base string");
        String base = input.nextLine();
        System.out.println("Please enter your mantisse number");
        int mantisse = input.nextInt();
        if (mantisse < 0){
        System.out.println("IllegalArgumentException.");
        }
        RecursiveCombineString(base, mantisse);
    }
    
    public static void RecursiveCombineString(String a, int b){
    if(b == 0){
    System.out.println("");
    }
        else{
        System.out.print(a + " ");
            RecursiveCombineString(a, b-1);
        }
    }
}














