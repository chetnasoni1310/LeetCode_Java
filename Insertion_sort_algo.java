import java.util.*;
//import java.io.*;



public class Insertion_sort_algo {

    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];

for (int i = 0; i <n ; i++) {
    arr[i] = sc.nextInt();
}
for (int i = 0; i <= arr.length-2; i++) {
     int j=i+1;
     while(j>0){
          if(arr[j]<arr[j-1]){
              swap(arr,j,j-1);
              j--;
          }
         else {
            break;
          }
}
}
System.out.println(Arrays.toString(arr));

sc.close();

}
}