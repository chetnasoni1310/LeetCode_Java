import java.util.*;
//import java.io.*;



public class SumOfDigitsOfInteger {

static int sum(int n){
    int sum=0;
    while(n!=0)
    {
        int rem=n%10;
        sum+=rem;
        n=n/10;
    }
    return sum;
}
static int sumREC(int n) {
    // int sum=0;
    if(n==0)
    {
        return 0;
    }
    return sumREC(n/10)+ (n%10);
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);

System.out.println(sum(1234667534));
System.out.println(sumREC(1230875534));

sc.close();


}
}