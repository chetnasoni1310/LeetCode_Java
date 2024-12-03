import java.util.*;
//import java.io.*;



public class Recursion_ArraySorted {

static boolean isSort(int []arr)
{
    return helper(arr,0);
}
private static boolean helper(int[] arr, int i) 
{
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]<=arr[i+1]){
        return helper(arr,i+1);
    }
    return false;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int []arr={1,2,3,4,5,16,7};
System.out.println(isSort(arr));


sc.close();


}
}