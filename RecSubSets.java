import java.util.*;
//import java.io.*;



public class RecSubSets {

static List<String> subset(String pro,String s){
    //   List<String> list = new ArrayList<String>();
    if(s.length()==0)
    {   List<String> list = new ArrayList<String>();
        list.add(pro);
        return list;
    }
    char ch=s.charAt(0);
   List<String> left=new ArrayList<String>(subset(pro+ch,s.substring(1))) ;
   List<String> right=new ArrayList<String>(subset(pro,s.substring(1))); ;
   left.addAll(right);
   
   return left;
}
public static void main(String[] args) {


Scanner sc =new Scanner(System.in);
List<String> l= subset("","abc");
System.out.println(l);


sc.close();


}
}