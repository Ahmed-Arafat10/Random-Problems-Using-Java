import java.util.*;
public class PerfectNumber6 {
 public static void main(String[] args)
 {
 int size;
 Scanner Input= new Scanner(System.in);
 size =Input.nextInt();
 int[] sum = new int[size];
 int[] arr=new int[size]; 
 for(int i=0;i<size;i++){
 arr[i] =Input.nextInt();
  }
 for(int i=0;i<size;i++){
 for(int j=1;j<=arr[i]/2;j++){
 if(arr[i]%j==0)
 sum[i] +=j;
 }
 }
 for(int i=0;i<size;i++){
 if (arr[i]==sum[i])
 System.out.println(arr[i]+" is perfect");
 else
 System.out.println(arr[i]+" is not perfect");
 }
 }

}
