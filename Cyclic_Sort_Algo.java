import java.util.*;
//import java.io.*;



public class Cyclic_Sort_Algo {


    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void cyclic_sort(int[]arr,int start){
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-start;
            // System.out.println(correct_index);
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
        }
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
int start=Integer.MAX_VALUE;
for (int i = 0; i <n ; i++) {
    arr[i] = sc.nextInt();
    if(arr[i]<start){
        start=arr[i];
    }
}
// System.out.println(start);
cyclic_sort(arr,start);
System.out.println(Arrays.toString(arr));
sc.close();
}
}