import java.util.*;
public class Mirrored {
  
 public static void main(String[] args)
 {
 Scanner Obj1 = new Scanner(System.in);
 Vector V1 = new Vector();
 String str ;
 
 int i=0;
 str=Obj1.nextLine();
 while(!str.equals("  ")){
 V1.add(str);
 str=Obj1.nextLine();
 i++;
 }
 System.out.println("Ready");
 for(int j=0;j<i;j++){
 if(V1.get(j).equals("db")||V1.get(j).equals("bd")||V1.get(j).equals("pq")||V1.get(j).equals("qp"))
 System.out.println("Mirrored");
 else
 System.out.println("Not Mirrored");
 
 }
 
 }

}
