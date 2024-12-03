import java.util.*;
//import java.io.*;



public class CielingOfnum {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={1,3,5,7,45,67,78,789};
int target=68;
sc.close();

System.out.println(get(arr,target));
}
public static int get(int[]arr,int target){
int start=0;
int end=arr.length-1;
            while(start<=end)
    {
            int mid=start + (end-start)/2;

            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else
                return mid;      
    }      
    return start;

}
}