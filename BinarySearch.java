import java.util.*;
//import java.io.*;



public class BinarySearch {

static int OrderAgnosticBinarySearch(int[]arr,int target){
  int start = 0;
  int end = arr.length-1;
  boolean isASCENDING= arr[start]<arr[end];
  while(start<=end){
    int mid=(start) + ( end-start)/2;

          if(arr[mid]==target){
              return mid;
            }
        if(isASCENDING){
          if(arr[mid]>target){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }
        else{
          if(arr[mid]<target){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }
      }
      return -1;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr = {1,2,3,4,5,6,7,8,9,34,56,765};
int target=34;
int start=0;
int end=arr.length-1;
         
        while(start<=end){
      int mid=(start) + ( end-start)/2;

            if(arr[mid]==target){
                System.out.println("Found at "+mid);
                break;
              }
         else if(arr[mid]>target){
            end=mid-1;

          }
          else{
            start=mid+1;

          }
        }
        if(start>end){
            System.out.println("Not found");
        }

sc.close();


}
}