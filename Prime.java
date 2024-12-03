import java.util.*;
//import java.io.*;



public class Prime {

 public static boolean isPrime(int n) {
   if(n<=1)
   {
    return false;
   }
   int start=2;
   while((start*start)%n<=0)
   { 
    if(n%start==0)
   { return false;
   }
   start++;

   }
   return true;
  
 }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
System.out.println(isPrime(n));


sc.close();


}
}