import java.util.*;
//import java.io.*;



public class FoundInMountainArray {

 static int FoundIndex(int[]arr,int target){
       int peak= mountainPeak(arr);
       int firstTry=OrderAgnosticBinarySearch(arr,target,0,peak);
       if(firstTry!=-1){
         return firstTry;
       }
       else{
         int secTry=OrderAgnosticBinarySearch(arr,target,peak+1,(arr.length-1));
         return secTry;
       }
}
static int mountainPeak(int[]arr){
    int start=0;
                                    int end=arr.length-1;
                                    while(start<end){
                                         int mid=start + (end-start)/2 ;
                                         if(arr[mid]>arr[mid+1]){
                                             end=mid;
                                         }
                                         else{
                                           start=mid+1;
                                         }
                                    }
                                     return end;
}
static int OrderAgnosticBinarySearch(int[]arr,int target,int start,int end){
    
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



sc.close();


}
}