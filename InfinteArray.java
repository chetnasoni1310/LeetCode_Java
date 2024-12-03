import java.util.*;
//import java.io.*;



public class InfinteArray {

public static int ans(int[]arr,int target){
   int start=0;
   int end=1;
   while(target>arr[end])
   {
      int temp=end+1;
      end=end+ ((end+start-1)*2);
      start=temp;
    }
   
    return  binarsearch(arr, target,start,end);

}
public static int binarsearch(int[]arr,int target,int start, int end){
   
    while(start<=end){
        int mid=(start) + ( end-start)/2;
  
              if(arr[mid]==target){
                  return mid;
                }
           else if(arr[mid]>target){
              end=mid-1;
  
            }
            else{
              start=mid+1;
  
            }
          }
         
            return -1;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int target=sc.nextInt();
// int[]arr={3,5,7,9,10,90,100,130,140,160,170};
// int target=10;
System.out.println(ans(arr, target));
sc.close();


}
}