import java.util.*;
//import java.io.*;



public class Recursion_REvOfNum {

static int rev(int n)
{  
   int rev=0;
   while(n!=0){
   int rem=n%10;
   n=n/10;
   rev=10*rev+rem;
   }
   return rev;
}

static int revREC(int n)
{
    if(n==0){
        return 0;
    }
    return revREC(n/10) +(10)*(n%10);
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
System.out.println(rev(1432));
System.out.println(revREC(1432));


sc.close();


}
}