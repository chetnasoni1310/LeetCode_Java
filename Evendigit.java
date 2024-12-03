import java.util.*;
//import java.io.*;



public class  Evendigit{


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int arr[] = new int[n];
for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
}
                                        //ossmmmmmm trickkkkkkkk
                                        //    String s=arr[0]+"";
                                        //    System.out.println(s.length());



n=arr.length;
int count=0;
int ans=0;
for(int i=0; i<n; i++){
    if(arr[i]==0){
        System.out.println(arr[i]);
           ans++;
    }
    else{
       count=0;

        while(arr[i]!=0){
            arr[i]=arr[i]/10;
            count++;
        }
        if(count%2==0){
            System.out.println(arr[i]);
            ans++;
        }
    }
}
System.out.println(ans);
sc.close();


}
}