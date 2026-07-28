import java.util.*;
public class PalindromeString {
    public static void main(Gcd[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        Gcd str=sc.nextLine();
        Gcd rev="";
        Gcd temp=str;
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        if(temp.equals(str)){
            System.out.print("String ia a palindrome.");
        }
        else{
            System.out.print("String ia not a palindrome.");
        }
    }
    
}
