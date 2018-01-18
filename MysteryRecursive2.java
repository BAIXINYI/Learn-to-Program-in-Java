import java.util.*;
public class MysteryRecursive2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number.");
    int n = input.nextInt();
    
    if (n < 0){
    System.out.println("IllegalArgumentException");
    }
    int num = (int)Math.pow(2, n);
    starString(num);
}
public static void starString(int n){
    if (n == 1){
    System.out.print("*");
    }
    else{
    starString(n-1);
        System.out.print("*");
    }

}
}

    


