import java.util.*;
//import java.io.*;



public class MergeSort {

public static int[] mergeSort(int[]arr)
{
    if(arr.length==1)
    {
        return arr;
    }
    int mid=arr.length/2;
    int[]left=mergeSort(Arrays.copyOfRange(arr,0,mid));
    int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

    return merge(left,right);
}
private static int[] merge(int[] left, int[] right) {
    int result[]=new int[left.length+right.length];
    int i=0,j=0,k=0;
    while(i<left.length && j<right.length)
    {
        if(left[i]<right[j]){
              result[k]=left[i];
              i++;
              k++;
        }
        else{
            result[k]=right[j];
            j++;
            k++;
        }
    }
    if(i<left.length && j>=right.length)
    {
        while(i<left.length)
        {
            result[k]=left[i];
            i++;
            k++;
        }
    }
    else if(j<right.length && i>=left.length){
        while(j<right.length)
        {
            result[k]=right[j];
            j++;
            k++;
        }
    }
    return result;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={4,6,2,12,8,9};
System.out.println(Arrays.toString(mergeSort(arr)));


sc.close();


}
}