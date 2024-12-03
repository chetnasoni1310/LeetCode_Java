import java.util.*;
//import java.io.*;



public class DupliNumArray442 {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
    int i=0;
    while(i<arr.length){
        int correct_index=arr[i]-1;
        if(arr[i]<=arr.length && arr[i]!=arr[correct_index]){
            swap(arr,i,correct_index);
        }
        else{
            i++;
        }
}
System.out.println(Arrays.toString(arr));
for (int j = 0; j < arr.length; j++) {
    if(arr[j]!=j+1){
        result.add(arr[j]);
    }
}
return result;
}
public static void swap(int[]arr,int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={4,3,2,7,8,2,3,1};
List<Integer> result=findDuplicates(arr);
Collections.sort(result);
System.out.println(result);
sc.close();


}
}