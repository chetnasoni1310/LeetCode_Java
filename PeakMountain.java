import java.util.*;
//import java.io.*;



public class PeakMountain {
static int mountainPeak(int[]arr){
                                    //NAIVE APPROACH
                                    // for(int i=0; i<arr.length; i++){
                                    //     if(arr[i]>arr[i+1]){
                                    //         return i;
                                    //     }
                                    // }


                                //CORRECT APPROACH
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
    //PARTIALLY CORRECT                                 
    // int start=0;                                                      
    // int end=arr.length-1;
    // int ans=0;
    // while(start<=end){
    //      int mid=start + (end-start)/2 ;
    //      if(arr[mid]<arr[mid+1]){
    //         start=mid+1;
    //      }
    //      else{
    //         ans=mid;
    //         end=mid-1;
    //      }
    // }
    // return ans;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
}
System.out.println(mountainPeak(arr));

sc.close();


}
}