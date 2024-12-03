import java.util.*;
//import java.io.*;
                                              //CANNOT apply moutain problem because it is never 
                                              //sloping downn its just a breakhole of 2 elements.
public class RotatedSortedArray {
static int searchPivot(int[]arr)
{
   int start=0;
   int end=arr.length-1;
   int mid=start + (end-start)/2;
   while(start<end){
    if(mid>start && arr[mid]<arr[mid-1]){
       return mid-1;
    }
    if(mid<end && arr[mid]>arr[mid+1]){
       return mid;
    }
    if(arr[mid]<=arr[start]){
       end= mid-1;
    }
    else{
      start= mid+1;
    }
   }
   return -1;
}
static int search(int[]arr,int target){
  int pivot=searchPivot(arr);
   if(pivot==-1){
   return orderAgnosticBinarySearch(arr,target,0,arr.length -1);
   }
   else if(arr[pivot]==target){
          return pivot;
   }
   else if(target>=arr[0]){
    return orderAgnosticBinarySearch(arr,target,0,pivot -1);
   }
   return orderAgnosticBinarySearch(arr,target,pivot+1,arr.length -1);
}
static int orderAgnosticBinarySearch(int[]arr,int target,int start,int end){
 
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
int arr[]={3,1};
int target=3;
System.out.println(search(arr,target));

sc.close();


}
}