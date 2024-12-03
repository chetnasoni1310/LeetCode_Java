import java.util.*;
//import java.io.*;



public class SetMismatch645 {
    public static int[] findErrorNums(int[] arr) {
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
    System.out.println(Arrays.toString(arr));
    for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j+1){
            // result[0]=arr[j];
            // result[1]=arr[j+1];
            return new int[]{arr[j],j+1};
        }


    }
    return new int[]{};

}
public static void swap(int[]arr,int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={1,2,2,4};
System.out.println( Arrays.toString(findErrorNums(arr)));

sc.close();


}
}