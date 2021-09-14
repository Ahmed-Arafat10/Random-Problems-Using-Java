import java.util.*;
public class Section1 {
  
 public static void main(String[] args)
 {
  int[] x=new int[]{9,100,0,3,5,10,30,2};
  int[] y=new int[]{0,5,9,3,10,100,30,2};
  boolean a = Arrays.equals(x,y);
  if(a==true)
  System.out.print("True\n");
  else
  System.out.print("False\n");
  Arrays.sort(x);
  Arrays.sort(y);
  boolean b= Arrays.equals(x,y);
    if(b==true)
  System.out.print("True\n");
  else
  System.out.print("False\n");
  
 }

}
