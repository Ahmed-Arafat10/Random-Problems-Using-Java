import java.util.*;
public class DecimalToBinary {
 public static void main(String[] args)
 {
 long x;
 int counter=0;
 Vector V = new Vector();
 Scanner Input= new Scanner(System.in);
 x =Input.nextLong();
 if(x==0)
  System.out.print(x);
 while(true){
  if(x%2==0){
 if (x==0)
 break;
   x/=2;
  V.add(0);
  counter++;
  }
  else{
   x/=2;
  V.add(1);
  counter++;
  }
  }
  for(int i=(counter-1);i>=0;i--)
  System.out.print(V.get(i));  
 }
}
