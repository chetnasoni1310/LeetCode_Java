import java.util.*;
//import java.io.*;



public class DuplicateNum287 {
    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
    }
    for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j+1){
            return arr[j];
        }
    }
    return -1;
    }
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
// int n=sc.nextInt();
int[]arr={1,3,4,2,2};
System.out.println(findDuplicate(arr));

sc.close();


}
}