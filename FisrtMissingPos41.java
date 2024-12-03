// import java.util.*;
//import java.io.*;

                                            //Correct niche h 
//GALAT H DUE TO SILLY MISTAKESSSSSSSSSSSSSSSSSS
// public class  FisrtMissingPos41 {

//     public static int firstMissingPositive(int[] arr) {
//         int start=Integer.MAX_VALUE;
//             for (int i = 0; i <arr.length ; i++) {
//                 if(arr[i]<start){
//                     start=arr[i];
//                 }
//             }
//         int i=0;
//         while(i<arr.length){
//             int correct_index=arr[i]-start;
//             if(arr[i]<=arr.length && arr[i]!=arr[correct_index]){
//                 swap(arr,i,correct_index);
//             }
//             else{
//                 i++;
//             }
//     }
//     for (int j = 0; j < arr.length; j++) {
//         if(arr[j]!=j-start){
//             if(j-start>0 )
//             return j-start;
//         }
//     }
//     return -1;
//     }
   
//     public static void swap(int[]arr,int a,int b){
//         int temp=arr[a];
//         arr[a]=arr[b];
//         arr[b]=temp;
//     }
// public static void main(String[] args) {


// Scanner sc =new Scanner(System.in);
// int[]arr={3,4,-1,1};

// System.out.println((firstMissingPositive(arr)));
// sc.close();


// }
// }
public class  FisrtMissingPos41{
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        
        // Rearrange the array
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            }
        }
        
        // Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        
        // If all positions are correct, then the missing positive is n + 1
        return n + 1;
    }
    
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(arr));  // Output: 2
    }
}
