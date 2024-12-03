import java.util.*;
//import java.io.*;



public class  PatternQues  {


public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
// Pattern1(5);
// System.out.println();
// System.out.println();
// Pattern2(5);
// System.out.println();
// System.out.println();
// Pattern3(5);
// System.out.println();
// System.out.println();
// Pattern4(5);
// System.out.println();
// System.out.println();
// Pattern5(5);
// System.out.println();
// System.out.println();
// Pattern6(5);
// System.out.println();
// System.out.println();
Pattern17(5);
// System.out.println();
// System.out.println();
// Pattern28(5);
// System.out.println();
// System.out.println();
// Pattern30(5);
// System.out.println();
// System.out.println();


sc.close();
}

public static void Pattern1(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
public static void Pattern2(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
public static void Pattern3(int n) {
        for(int i=1; i<=n; i++){
            for(int j=n+1-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
}
public static void Pattern4(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                
                System.out.print(j);
            }
            System.out.println();
        }
}
public static void Pattern5(int n) {
    for (int row = 1; row <2*n; row++) {
          int total_Cols_In_Row=row>n?2*n-row:row;
 
          // dekh row<=n ke liye toh jitni row no utne tak col jayega
          // lekin else mai row>n ke liye col kaha tak jayega voh dekhna hai 
          for (int col = 1; col <= total_Cols_In_Row;col++){
               System.out.print("*");
          }
          System.out.println();
    }
 }
 public static void Pattern6(int n) {
    for(int row=1; row<=n; row++){
        int no_of_spaces=n-row;
        for (int spaces = 0; spaces <no_of_spaces; spaces++) {
            System.out.print(" ");
        }
        for(int col=1; col<=row; col++){
            System.out.print("*");
        }
        System.out.println();
    }
}

static void Pattern17(int n){
    for (int row = 1; row <= 2*n-1; row++) {
        // int tot_spaces=n-c;
        int c=row>n?2*n-row:row;

        for (int spaces = 0; spaces <n-c; spaces++) {
            System.out.print("  ");
        }
      
        for (int col = c; col>=1; col--) {
            System.out.print(col+" ");
        }
        for (int col =2; col<=c; col++) {
            System.out.print(col+" ");
        }
        System.out.println();
    }
  }

 public static void Pattern28(int n) {
    for(int row=0; row<2*n-1; row++){
        int total_Cols_In_Row=row < n ? row + 1 : 2 * n - row - 1;
        int no_of_spaces=n-total_Cols_In_Row;
        for (int spaces = 0; spaces <no_of_spaces; spaces++) {
            System.out.print(" ");
        }
        for (int col = 0; col < total_Cols_In_Row;col++){
            System.out.print("* ");
       }
        System.out.println();
    }
}
  public static void Pattern30(int n){
    for (int row = 1; row <= n; row++) {
        int tot_spaces=n-row;
        for (int spaces = 0; spaces <tot_spaces; spaces++) {
            System.out.print(" ");
        }
        // int total_Cols_In_Row=2*row-1;
        for (int col = row; col>=1; col--) {
            System.out.print(col);
        }
        for (int col =2; col<=row; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
  }
  
  public static void Pattern31(int n){
    for (int row = 1; row <2*n; row++) {
        for (int col = n; col; col--) {
            System.out.print();
        }
        System.out.println();
    }
  }

}