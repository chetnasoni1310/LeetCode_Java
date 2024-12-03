import java.util.*;
//import java.io.*;



public class aaIMP_CONCEPTS {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
                                    //char array to string
                                    char[] ch={'a','b','c','d'};
                                    String s1=String.valueOf(ch);
                                    System.out.println("s1= "+s1);
                                    String s2=new String(ch);
                                    System.out.println("s2= "+s2);



// nextLine() -->This method can read the input till the end of line. 
// In other words, it can take input until the line change or new line 
// and ends input of getting ‘\n’ or press enter. 

// next() -->This method can read the input until the space or enter



     //String to char array
     String s3=sc.nextLine();                               
     char[]letters=s3.toCharArray();
     System.out.println(Arrays.toString(letters));


sc.close();


}
}