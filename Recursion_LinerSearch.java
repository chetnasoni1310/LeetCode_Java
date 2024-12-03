import java.util.*;
//import java.io.*;



public class Recursion_LinerSearch {

    static int search(int[]arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        else {
             return search(arr,target,i+1);
        }
    }

public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={1,2,3,4,5,6,7};
System.out.println(search(arr, 0, 0));


sc.close();


}
}