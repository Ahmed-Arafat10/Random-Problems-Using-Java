import java.util.*;
public class SelectionTest1 {
  
 public static void main(String[] args)
 {
 int A,B,C,D,SumCD,SumAB;
  Scanner Obj1=new Scanner(System.in);
  A =Obj1.nextInt();
  B =Obj1.nextInt();
  C =Obj1.nextInt();
  D =Obj1.nextInt();
  SumCD=C+D;
  SumAB=A+B;
  if(B>C&&D>A&&SumCD>SumAB&&C>0&&D>0){
 if(A%2==0)
 System.out.println("Accepted values");
  }
  else
  System.out.println("Values not accepted");
  
  
  
  
  
 }

}
