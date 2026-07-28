import java.util.*;
class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int s1=sc.nextInt();
        System.out.print("Enter second number: ");
        int s2=sc.nextInt();
        int gcd=1;
        for(int i=0;i<Math.min(s1,s2);i++){
            if(s1%i==0 && s2%i==0){
                gcd=i;
            }
        }
        System.out.print(gcd);
    }
}