import java.util.*;
//import java.io.*;


//WRONG APPROACH 
// int i=0;
// // int ans=0;
// while(k>chalk[i]){
//     k=k-chalk[i];
//     ++i;
//     if(i==chalk.length){
//         // ans+=i;
//         i=0;
//     }
// }
// if(i==chalk.length-1){
// return 0;
// }
// else{
// return i;
// }

public class Chalk_Replace1894 {

    public static int chalkReplacer(int[] chalk, int k) {
        long totalChalk=0;
        for(int i=0; i<chalk.length; i++){
          totalChalk+=chalk[i];
        }
        k %= totalChalk;
        
        // Find the index of the person who will get the chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        return -1;
    }
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
int[]arr={3,4,1,2};
int k=sc.nextInt();
System.out.println(chalkReplacer(arr,k));



sc.close();


}
}