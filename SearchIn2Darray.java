import java.util.*;
//import java.io.*;



public class SearchIn2Darray {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[][] arr = new int[3][4];
for(int i=0; i<arr.length;i++){
    for(int j=0; j<arr[i].length;j++){
         arr[i][j] =sc.nextInt();
    }
}
int target = sc.nextInt();
for(int i=0; i<arr.length;i++){
    for(int j=0; j<arr[i].length;j++){
        if(arr[i][j]==target){
            System.out.println("Found "+target+" at "+"["+i+"]"+"["+j+"]");
        }
       }
}


sc.close();


}
}