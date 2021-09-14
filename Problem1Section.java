import java.util.*;
public class Problem1Section {
  
 public static void main(String[] args)
 {
 Scanner Obj1=new Scanner(System.in);
 int SIZE = Obj1.nextInt();
 String[] Mystr=new String[SIZE];
 int Counter=0;
 for(int i=0;i<SIZE;i++){
 Mystr[i]=Obj1.next();
 if(Mystr[i].equals("X++")||Mystr[i].equals("++X"))
 Counter++;
 else
Counter--;
 }
 
  System.out.println(Counter);
 }

}
