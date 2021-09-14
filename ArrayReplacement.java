import java.util.*;
public class ArrayReplacement {
  
 public static void main(String[] args)
 {
 int[] arr=new int[10];
 Scanner Input= new Scanner(System.in);
 for(int i=0;i<10;i++){
 arr[i] =Input.nextInt();
 }
 for(int i=0;i<10;i++){
 if(arr[i]==0||arr[i]<0)
 arr[i]=1;
 System.out.println("X["+i+"] = "+arr[i]);
 
 }
 
 }

}
