import java.util.*;
//import java.io.*;



public class RichestCustomerWealth {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int[][] arr=new int[x][y];
int sum=0;
int max=0;

for(int i=0; i<arr.length; i++) {
    for(int j=0; j<arr[i].length; j++){
        arr[i][j]=sc.nextInt();
        sum=sum+arr[i][j];
        }
    if(max<sum){
          max=sum;  
    }
    sum=0;
}
System.out.println(max);

sc.close();


}
}