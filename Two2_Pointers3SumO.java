import java.util.*;
//import java.io.*;



public class Two2_Pointers3SumO {

public static  List<Integer>  Sum2(int[]arr,int target,int i,int j){
    boolean isPresent=false;
    ArrayList<Integer> list = new ArrayList<>();
    while(i<j){
        if(arr[i]+arr[j]==target){
            isPresent=true;
            if(isPresent){
                list.add(i);
                list.add(j);
                return list;
            }
        }
        else if(arr[i]+arr[j]<target){
            i++;
        }
        else{
            j--;
        }
    }
     return list;
}

public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int []arr=new int[n];
for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
}
System.out.println("Enter target ");
int target=sc.nextInt();

Arrays.sort(arr);
ArrayList<Integer> list = new ArrayList<>();
for(int i=0; i<n-2; i++){
     Collections.fill(list,0);
     int temp=target-arr[i];
     int start=i+1;
     int end=arr.length -1;
     Sum2(arr,temp,start,end);

}

sc.close();


}
}