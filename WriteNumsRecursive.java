import java.util.*;
public class WriteNumsRecursive{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers do you want to output?");
    int num = input.nextInt();
    if (num < 1){
    System.out.println("IllegalArgumentException！");
    }
    writrNum(num);
}
public static void writrNum(int n){
    if (n == 1){
    System.out.print("1, ");
    }
    else{
    System.out.print(n + ", ");
    n --;    
    writrNum(n);
}
}
}
