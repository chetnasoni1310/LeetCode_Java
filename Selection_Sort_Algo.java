import java.util.*;
//import java.io.*;



public class Selection_Sort_Algo {

public static int maxIndex(int[]arr,int start,int last){
    int max=start;
    for (int i = start; i <= last; i++) {
        if(arr[max]<arr[i]){
            max=i;
        }
    }
    return max;
}
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
for (int i = 0; i < arr.length; i++) {
    int last=n-1-i;
    int maxIndex=maxIndex(arr,0,last);
    swap(arr,maxIndex,last);
}
System.out.println(Arrays.toString(arr));

sc.close();


}
}