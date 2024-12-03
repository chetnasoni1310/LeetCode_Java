import java.util.*;
//import java.io.*;



public class CielingOfChar {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);

String s3=sc.nextLine();                               
char[]letters=s3.toCharArray();
System.out.println(Arrays.toString(letters));


char target=sc.next().charAt(0);
int start=0;
int end=letters.length-1;
            while(start<=end){
            int mid=start + (end-start)/2;

            if(target<letters[mid]){
                end=mid-1;

            }
            else {
                start=mid+1;

            }
            }
        // return letters[start % letters.length];
        System.out.println(letters[start % letters.length]);
sc.close();
        }
}
