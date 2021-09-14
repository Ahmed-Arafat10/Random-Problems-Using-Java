import java.util.*;
public class SortArray {
 public static void main(String[] args)
 {
 int size;
Scanner Obj1=new Scanner(System.in);
System.out.println("Please enter Size of Array");
  size =Obj1.nextInt();
  int[] arr= new int[size];
  for(int i =0;i<arr.length;i++){
  arr[i]=Obj1.nextInt();
  }
  for(int i =0;i<size;i++){
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
  for(int i =0;i<arr.length;i++){
  System.out.print(arr[i]+" ");
  }
    
 }

}
