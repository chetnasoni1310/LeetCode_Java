import java.util.*;
//import java.io.*;



public class Factorial {
     ////////////////////////////////////////////////////////////////
     ////////////////////////////////////////////////////////////////   for larger number use biginteger 
    public static int fact(int n)
    {   
        if(n==1 || n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int ans=fact(50);
System.out.println(ans);
sc.close();
}
}