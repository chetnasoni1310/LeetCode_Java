import java.util.*;
//import java.io.*;


     //HAsh map use krke hoega abhi nhi aata h mujhe baad m karenge 
     nnnnnn
public class CoupleHand765 {
    public static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int minSwapsCouples(int[] arr) {
        int i=0;
        int swap=0;
        while(i<arr.length){
            int correct_index=arr[i];
            // System.out.println(correct_index);
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
                swap++;
            }
            else{
                i++;
            }
        }
       
        System.out.println(swap);
        return arr.length-2-swap;
    }
   
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={2,0,5,4,3,1};
System.out.println(minSwapsCouples(arr));

sc.close();


}
}