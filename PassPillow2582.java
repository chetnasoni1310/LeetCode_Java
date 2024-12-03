import java.util.*;
//import java.io.*;



public class PassPillow2582 {

    public static int passThePillow(int n, int time) {
        int i=1;
        boolean isEnd=false;
        while(time-->0){
            if(!isEnd){
            i++;
            }
            else{
                i--;
            }
           if(i==n){
            isEnd=true;
            // i--;
           }
           else if(i==1){
            isEnd=false;
           }
           
        }
        return i;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
// int []arr={1,2,3,4};
int n=4;
int time=5;
System.out.println(passThePillow(n, time));


sc.close();


}
}