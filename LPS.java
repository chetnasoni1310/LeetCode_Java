import java.util.*;
//import java.io.*;



public class LPS {

public static int length_LPS(String s) {
    int l=s.length();
    int[]lps=new int[l];
    int pre=0;
    int suf=1;
    lps[0]=0;
    int ans=0;
    // for (int i = 0; i < lps.length; i++) {
       while(suf<l)
            if(s.charAt(pre)==s.charAt(suf))
            {  
               lps[suf]=pre+1;
               suf++;
               pre++;
            }
           else {
            //  lps[suf]=0;
            //  suf++;
            
            if(pre==0)
            {
                lps[suf]=0;
            }
            else if(pre>0)
            {
                s.charAt(pre--)

            }
           }
    }
  
    return ans;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
String s="abcdeabcd";
System.out.println(length_LPS(s));


sc.close();


}
}