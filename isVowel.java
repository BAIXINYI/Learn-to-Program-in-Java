import java.util.*;
public class isVowel{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("what is your string?");
    String usrstring = input.next();
    boolean ans = isVowel(usrstring);
    if(ans){
    System.out.println(usrstring + " is vowel.");
    }
    else{
    System.out.println(usrstring + " is nonvowel.");
}
}    
public static boolean isVowel(String input){ 
    boolean ans = true;
    if(input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u")||input.equals("A")||input.equals("E")||input.equals("I")||input.equals("O")||input.equals("U")){
    ans = true;
    }
    else{
        ans = false;
    }
return ans;
}
}
