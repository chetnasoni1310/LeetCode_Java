import java.util.*;
//import java.io.*;



public class MissingNumb268 {
    
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
    }
    for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j){
            return j;
        }
    }
    return arr.length;
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
int start=Integer.MAX_VALUE;
for (int i = 0; i <n ; i++) {
    arr[i] = sc.nextInt();
    if(arr[i]<start){
        start=arr[i];
    }
}

sc.close();


}
}