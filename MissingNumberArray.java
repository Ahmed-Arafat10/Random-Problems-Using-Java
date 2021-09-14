import java.util.*;
public class MissingNumberArray {
  
 public static void main(String[] args)
 {
 Scanner Obj1=new Scanner(System.in);
 int SIZE = Obj1.nextInt();
 //Make it [SIZE-1]
 int[] Myarr =new int[SIZE-1];
 for(int i=0;i<SIZE-1;i++)
 Myarr[i]=Obj1.nextInt();
 
 int[] Myarr1 =new int[SIZE];
 for(int i=0;i<SIZE;i++){
 for(int j=0;j<SIZE-1;j++){
 if(i==Myarr[j])
 Myarr1[i]++; 
 }
 if(Myarr1[i]!=1)
 System.out.println(i);
 }  
 /*
int SumNum= SIZE*(SIZE+1)/2;
int SumArray=0;
int missed;
for(int i=0;i<SIZE;i++)
SumArray+=Myarr[i];
missed=SumNum-SumArray;
System.out.println(missed);
*/
 }
}
