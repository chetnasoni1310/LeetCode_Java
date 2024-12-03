import java.util.*;
//import java.io.*;



public class Fibonacci {

 static int fibo(int n){
   if(n<2){
    return n;
   }
    return (fibo(n-1)+fibo( n-2));
}

  static long 
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int ans=fibo(8);
System.out.println(ans);


sc.close();


}
}