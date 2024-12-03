import java.util.*;
//import java.io.*;



public class Recursion_Binary_Search {

public static int search(int[]arr,int target,int s,int e){

    if(s>e){
        return -1;
    }
    int mid=s+(e-s)/2;
    if(target==arr[mid]){
        return mid;
    }
    else if(target>arr[mid]){
       return search(arr,target,mid+1,e);
    }
    else {
       return search(arr,target,s,mid-1);
    }
   
}
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int[]arr={1,2,3,4,5,6,7,8,67,89,2344,567};
int target=89;
System.out.println(search(arr, target,0,arr.length-1));


sc.close();
}
}