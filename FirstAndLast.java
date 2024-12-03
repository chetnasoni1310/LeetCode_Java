import java.util.*;
//import java.io.*;



public class  FirstAndLast {

public static int get(int[]arr,int n,int target,boolean isStart){
    int ans=-1;
    int start=0;
     int end=arr.length-1;
         
        while(start<=end){
            int mid=(start) + ( end-start)/2;

            if(arr[mid]==target){
                ans=mid;
                if(isStart)
                end=mid-1;
                else{
                    start=mid+1;
                }
              }
         else if(arr[mid]>target){
            end=mid-1;

          }
          else{
            start=mid+1;

          }
        }
    

return ans;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
int target=sc.nextInt();
n=arr.length;
int[]arr2=new int[2];
arr2[0]= get(arr, n, target, true);
arr2[1]= get(arr, n, target, false);

System.out.println(Arrays.toString(arr2));
sc.close();


}
}
