import java.util.*;
public class LowestNumberAndPosition1 {
  
 public static void main(String[] args)
 {
 int size;

 Scanner Input= new Scanner(System.in);
 size =Input.nextInt();
 int[] arr=new int[size];
 for(int i=0;i<size;i++){
 arr[i] =Input.nextInt();
 }
 int x =arr[0];
 int index=0;
 for(int i=0;i<size;i++){
 if(arr[i]<x){
 x=arr[i];
 index=i;
 }
 }
  System.out.println("Minimum Element: "+x);
  System.out.println("Position: "+index);
 }

}
