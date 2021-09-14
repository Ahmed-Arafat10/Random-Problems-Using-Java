import java.util.Scanner;
//import java.io.PrintStream;
public class ConvertIntToString {
  
 public static void main(String[] args)
 {
  int n ;
  Scanner Ob1= new Scanner(System.in);
  n = Ob1.nextInt();
  if( (-100<n) && (n<100) ){
  System.out.print("Good job");
  }
  else 
  System.out.print("Wrong answer");
  
  
 }

}
