import java.util.*;
public class SortArrayAscending {
 public static void main(String[] args)
 {
 int[] arr=new int[10];
Scanner Obj1=new Scanner(System.in);
for(int i=0;i<10;i++){
  arr[i] =Obj1.nextInt();
  System.out.println(arr[i]);
  }
  //for(int i=0;i<10;i++){
  //System.out.println(arr[i]);
  //}
 System.out.println("\n");
 
  for(int i =0;i<10;i++){
  for(int j=0;j<i;j++){
  //Use (<) if you want it in Ascending Order
  //Use (>) if you want it in Descending Order
  if(arr[i]<arr[j])
  {
  int x=arr[i];
  arr[i]=arr[j];
  arr[j]=x;
  }
  }
  }
  for(int i =0;i<10;i++){
  System.out.println(arr[i]);
  }
    
 }

}
