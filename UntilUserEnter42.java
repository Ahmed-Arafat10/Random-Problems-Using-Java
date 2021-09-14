import java.util.*;
public class UntilUserEnter42 {
  
 public static void main(String[] args)
 {
  Scanner Obj1 = new Scanner(System.in);
//boolean W = false;
int x =0;
  while(x !=42){
  try {
      x = Obj1.nextInt();
  }
  catch(Exception e)
  {
     //W = true;
     System.out.println("You should enter an integer numbers");   
   //  System.exit(0);
     }
  //if (W==true)
//  System.out.println("error");
 // else {
 if (x==42)
 break;
System.out.println(x);
  //x = Obj1.nextInt();
  }
  // }
 }
}

