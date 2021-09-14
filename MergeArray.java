import java.util.*;
public class MergeArray {
 public static void main(String[] args)
 {  Scanner Obj=new Scanner(System.in);
 int SIZE1=Obj.nextInt();
 int SIZE2=Obj.nextInt();
 int[] Arr1=new int[SIZE1];
 int[] Arr2=new int[SIZE2];
 for(int i=0;i<SIZE1;i++)
 Arr1[i]=Obj.nextInt();
  for(int j=0;j<SIZE2;j++)
 Arr2[j]=Obj.nextInt();
 int SIZE3 =SIZE1+SIZE2;
 int[] Arr3=new int[SIZE3];
 for(int i=0;i<SIZE1;i++)
 Arr3[i]=Arr1[i];
 int x=0;
 for(int i=SIZE1;i<SIZE3;i++){
 Arr3[i]=Arr2[x];
 x++; }
 for(int i=0;i<SIZE3;i++){
 for(int j=0;j<i;j++)
 if(Arr3[i]<Arr3[j]){
int Swap= Arr3[i];
Arr3[i]=Arr3[j];
Arr3[j]=Swap; } }
 for(int i=0;i<SIZE3;i++){
 System.out.print(Arr3[i]+" ");
  }
 }
}
