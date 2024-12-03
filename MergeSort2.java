import java.util.*;
//import java.io.*;



public class MergeSort2 {

    static int[] mergeSort(int[]arr,int s,int end)
{
    if(arr.length==1)
    {
        return arr;
    }
    int mid=(s+end)/2;
    mergeSort(arr,s,mid);
    mergeSort(arr,mid,end);

}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);



sc.close();


}
}