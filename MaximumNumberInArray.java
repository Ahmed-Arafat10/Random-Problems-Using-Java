import java.util.*;
public class MaximumNumberInArray {
static int Max;
static int Min;
static int counterMax;
static int counterMin;

 public static void main(String[] args)
 {
 
 int SIZE;
 
 Scanner Input= new Scanner(System.in);
 SIZE =Input.nextInt();
 
 int[] arr = new int[SIZE];
 for(int i=0;i<SIZE;i++){
arr[i]=Input.nextInt();
 }
 Max = arr[0];
 Min = arr[0];
 for(int i =0;i<SIZE;i++){
 int x=arr[i];
MaxArray(x,i); 
MinArray(x,i);
 }
 System.out.println("The Maximum Number In Array Is : "+Max);
 System.out.println("It's Index is : "+counterMax+"\n");
 System.out.println("The Minimum Number In Array Is : "+Min);
 System.out.println("It's Index is : "+counterMin);
 }
 //Maximum Method
public  static void MaxArray(int x,int i){
 if(x>Max){
 Max = x;
 counterMax=i;
 }
 }
 //Minimum Method
 public static void MinArray(int x,int i){
 if(x<Min){
 Min = x;
 counterMin=i;
 }
 }
}
