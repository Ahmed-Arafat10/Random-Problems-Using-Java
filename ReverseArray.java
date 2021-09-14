import java.util.*;
public class ReverseArray {
  
 public static void main(String[] args)
 {
 Scanner Obj1 = new Scanner(System.in);
 int SIZE = Obj1.nextInt();
 int[] Myarr= new int[SIZE];
 int Swap_;
 for(int i=0;i<Myarr.length;i++){
 Myarr[i]=Obj1.nextInt();
 }
 int k=(Myarr.length-1);
 for(int i=0;i<SIZE/2;i++){
  //for(int j=0;j<1;j++){
 Swap_=Myarr[i];
 Myarr[i]=Myarr[k];
 Myarr[k]=Swap_;
k--;
 //}
 }
 for(int i=0;i<Myarr.length;i++){
 System.out.print(Myarr[i]+" ");
 }
 
 }

}
