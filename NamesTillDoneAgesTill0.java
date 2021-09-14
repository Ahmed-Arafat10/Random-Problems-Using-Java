import java.util.*;
public class NamesTillDoneAgesTill0 {
  
 public static void main(String[] args)
 {
 String[][] Myarr = new String[2][100];
 
Scanner Obj1=new Scanner(System.in);
System.out.println("enter name");
String str ;
str = Obj1.next();
 int i=0;
 while(!str.equals("done")){
 Myarr[0][i]=str;
 System.out.println("enter name");
 str = Obj1.next();
i++; 
 }
 System.out.println("enter age");
 String str1 = Obj1.next();
 int j=0;
 while(!str1.equals("0")){
 Myarr[1][j]=str1;
 System.out.println("enter age");
 str1 = Obj1.next();
j++; 
 }
 for(int k=0;k<j;k++){
  System.out.println("name is "+Myarr[0][k]+" and age is : "+Myarr[1][k]);
  }
  
 }

}
