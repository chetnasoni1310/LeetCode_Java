// import java.util.*;
//import java.io.*;



public class BuyAndSellStockEasy {

    
        public static int maxProfit(int[] arr) {
            int len=arr.length;
            int max=arr[0],min=arr[0];
            int m=0,M=0;
            for(int i=1;i<len;i++)
            {
               if(min>arr[i])
               {
                min=arr[i];
                m=i;
               }
               if(max<arr[i])
               {
                max=arr[i];
                M=i;
               }
            }
            System.out.println(min);
            System.out.println(max);
            if(M<m){
               if(m==len-1)
               {  
                System.out.println(min +" 1");
                return 0;
               }
               else
               {
                     max=0;
                for(int i=m;i<len;i++)
                {
                        if(max<arr[i])
                        {
                            max=arr[i];
                            M=i;
                        }
                }
                System.out.println(max + " "+" "+ min+"  2");
                return max-min;
               }
            }
            else {
                System.out.println(max + " "+" "+ min+"  3");
                return max-min;
            }
        }

        public static void main(String[] args) {
            int []arr={7,6,4,3,1};
            System.out.println(maxProfit(arr));
        }
    }