import java.util.*;
public class MaxMinArray {
  
 public static void main(String[] args)
 {
 /*
Scanner Obj1=new Scanner(System.in);
int SIZE = Obj1.nextInt();
int[] Myarr=new int[SIZE] ;
for(int i=0;i<SIZE;i++){
Myarr[i]=Obj1.nextInt();
}
*/
int[] Myarr=new int[]{1,5,6,8,9,10,20,12,0};
int Max=Myarr[0];
int Min=Myarr[0];
int IndexMx=0;
int IndexMn=0;
 for(int i=0;i<Myarr.length;i++){
 if(Myarr[i]>Max){
  Max=Myarr[i];
  IndexMx=i;
  }
  if(Myarr[i]<Min){
  Min=Myarr[i];
  IndexMn=i;
  }
 }
  System.out.println(Max+"   "+IndexMx);
  System.out.println(Min+"   "+IndexMn);
  
  int[][] myarr={{1,2,3},{4,5,6},{7,8,9}};
  System.out.println(myarr[1][0]);
 }


}
