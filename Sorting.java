import java.util.*;
//import java.io.*;



public class Sorting {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
boolean swapped;
for(int i = 0; i < n-1; i++) {
    swapped=false;
    for(int j = 1; j <n-i; j++) {
    if(arr[j]<arr[j-1]){
          int temp=arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
          swapped=true;
    }
}
if(!swapped){
    break;
}
}


sc.close();


}
}