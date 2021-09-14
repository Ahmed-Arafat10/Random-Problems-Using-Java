import java.util.*;
public class VectorTest {
  
 public static void main(String[] args)
 {
 int SIZE;
  Scanner Obj1 = new Scanner(System.in);
  SIZE=Obj1.nextInt();
  Vector V1 = new Vector();
  //int x= Obj1.nextInt();
  for(int i=0;i<SIZE;i++){
  int x= Obj1.nextInt();
  V1.add(x);
  System.out.println(V1.get(i));
  }
 
 }

}
