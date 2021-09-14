import java.util.*;
public class Factorial {
  
 public static void main(String[] args)
 {
 Scanner Obj1=new Scanner(System.in);
 int num =Obj1.nextInt();
 int Factorial=1;
 for(int i=num;i>=1;i--)
 Factorial*=i;
  System.out.println(Factorial);
 }

}
