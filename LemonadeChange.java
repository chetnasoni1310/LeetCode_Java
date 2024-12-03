import java.util.*;
//import java.io.*;



public class LemonadeChange  {

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for(int bill: bills) {

            if( bill == 5)
                five++;
            else if( bill == 10) {
                if( five >= 1) {
                    five--;
                    ten++;
                }else
                    return false;

            }else {
                if(five >= 1 && ten >= 1) {
                    ten--;
                    five--;
                }else if( five >= 3)
                    five -= 3;
                else
                    return false;
            }
        }
        return true;
        




    //     int change5=0;
    //     int change10=0;
        
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]==5){
    //             change5++;
    //         }
    //         else if(arr[i]==10){
    //             change10++;
    //             change5--;
    //         }
    //         else{
    //             if(change10>0){
    //                 change10--;
    //                 change5--;
    //             }
    //             else{
    //                 change5=change5-3;
    //             }
    //         }
    //         if(change5<0){
    //             return false;
    //         }
    // }
    //     return true;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
int[]arr = new int[n];
for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
}
System.out.println(lemonadeChange(arr));

sc.close();


}
}