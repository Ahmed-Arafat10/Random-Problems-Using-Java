import java.util.*;
public class StringLenghtFunc {
//String Length Function
 static int length(String x){
 char[] str1=x.toCharArray();
 int i=0;
 for(int j:str1)
 i++;
 return i;
 }
 
 public static void main(String[] args)
 {
 Scanner Obj1=new Scanner(System.in);
 String str = Obj1.nextLine();
 System.out.println(length(str));
 }
}